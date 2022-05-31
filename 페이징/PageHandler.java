package 페이징;

public class PageHandler {

	public static void main(String[] args) {
		//여신강림 페이지
		//야옹이 작가는 210화까지 연재함.

		//step1. 페이지 수 알아내기 (총 카운트와 한페이지에 몇개를 보여줄지가 중요)
		int total = 219; //SQL에서 count!!
		//네이버 웹툰 기준으로 1페이지 10개에 게시물을 보여줄 수 있다.
		int pages = 0;
		int pageSize = 10; //1페이지에 보여줄수 있는 게시물 수
		//몇개 페이지가 나올까?
		pages = total / pageSize;
		if(total % pageSize > 0) ++pages;
		System.out.println("총 페이지 수 ===> "+pages);
		System.out.println("한 페이지에 보여줄 게시물 수 ===> "+pageSize);
		
		//step2. 블록 알아내기
		int navigatePages = 10; // 한블록에 몇페이지를 보여줄지
		int blocks = 0;
		blocks = pages/navigatePages;
		if(pages%navigatePages >0) ++blocks;
		System.out.println("총 블록 수 ===> "+blocks);

		//step3. 현재 내가 위치한 블록 알아내기
		int pageNum = 11;//현재 페이지
		System.out.println("현재 페이지번호 ===> "+pageNum);
		int nowBlocks = 0;
		nowBlocks = pageNum / navigatePages;
		if(pageNum%navigatePages >0){
			++nowBlocks;} 
		System.out.println("현재 블록은 ===>"+nowBlocks);
		
		//step4. 마지막 블록 알아내기
		int lastBlock = 0;
		//*hint : total, navigatePages, pageSize
		lastBlock = total/(navigatePages*pageSize);
		if(total%(navigatePages*pageSize) >0) {
			++lastBlock;
		}
		System.out.println("마지막 블록은 ===> "+lastBlock);
		
		//step5. 현재 내가 위치한 블록의 처음 페이지와 마지막 페이지 구하기
		//ex) 1블록에 있으면 1~10
		//	  2블록에 있으면 11~20
		//	  3블록에 있으면 21~22 (여신강림 기준)
		int startPage = 0;
		int endPage = 0;
		//힌트 startPage를 먼저 구하자.
		startPage = (nowBlocks * navigatePages) - (navigatePages -1);
		//방법1.
		endPage = nowBlocks * navigatePages;
		//방법2.
		endPage = startPage + (navigatePages - 1);
		
		if(nowBlocks == lastBlock) {
			endPage = pages;
		}
		
		System.out.println("처음 페이지 ===> "+startPage);
		System.out.println("마지막 페이지 ===> "+endPage);
		
		//step6. 이전버튼, 다음버튼 유무 판단
		boolean hasPreviousPage = true; //이전버튼
		boolean hasNextPage = true; //다음버튼
		
		if(lastBlock == 1) {//블록이 하나이므로 이전, 다음 버튼 존재 X  ex) 게시글이 적어 페이지를 넘기지 못하는 경우
			hasPreviousPage = false;
			hasNextPage = false;
		}
		if(lastBlock > 1 && lastBlock == nowBlocks) { //마지막 블록이라면 이전 버튼만 존재 ex) 23페이지 중 23페이지일때
			hasPreviousPage = true;
			hasNextPage = false;
		}
		if(lastBlock > 1 && pageNum <= navigatePages) {//첫번째 블록인데 블록이 1이상인 경우 다음 버튼 존재 ex)23페이지 중 1~10 페이지
			hasPreviousPage = false;
			hasNextPage = true;
		}
		System.out.println("이전 버튼이 있습니까? "+hasPreviousPage);
		System.out.println("다음 버튼이 있습니까? "+hasNextPage);
	}
		

}
