package com.board.bdi.vo;

public class PageInfo {
	private Integer page = 1;		//
	private Integer rowCnt = 10;	// 보여질 게시물 갯수
	private Integer blockCnt = 10;	// 블락 갯수
	private Integer totalCnt;		// 게시물 갯수 
	private Integer limitFNum = 0;	// First
	private Integer limitLNum = 10;	// Last

	private Integer totalPage;
	private Integer totalBlock;
	private Integer sBlock;		// start
	private Integer eBlock;		// end 
	
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRowCnt() {
		return rowCnt;
	}

	public void setRowCnt(Integer rowCnt) {
		this.rowCnt = rowCnt;
	}

	public Integer getBlockCnt() {
		return blockCnt;
	}

	public void setBlockCnt(Integer blockCnt) {
		this.blockCnt = blockCnt;
	}

	public Integer getTotalCnt() {
		return totalCnt;
	}

	public void setTotalCnt(Integer totalCnt) {
		this.totalCnt = totalCnt;
	}

	public Integer getLimitFNum() {
		return limitFNum;
	}

	public void setLimitFNum(Integer limitFNum) {
		this.limitFNum = limitFNum;
	}

	public Integer getLimitLNum() {
		return limitLNum;
	}

	public void setLimitLNum(Integer limitLNum) {
		this.limitLNum = limitLNum;
	}
	
	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getTotalBlock() {
		return totalBlock;
	}

	public void setTotalBlock(Integer totalBlock) {
		this.totalBlock = totalBlock;
	}

	public Integer getsBlock() {
		return sBlock;
	}

	public void setsBlock(Integer sBlock) {
		this.sBlock = sBlock;
	}

	public Integer geteBlock() {
		return eBlock;
	}

	public void seteBlock(Integer eBlock) {
		this.eBlock = eBlock;
	}

	public void pageCount() {
		if(totalCnt==null) {
			//TODO 에러처리필요
		}
		totalPage = (int)(Math.ceil((double)totalCnt/rowCnt));
		totalBlock = (int)(Math.ceil((double)totalPage/blockCnt));
		limitFNum = (page-1) * rowCnt;
		sBlock = ((int)(Math.ceil((double)page/blockCnt))-1) * 10 +1;
		eBlock = sBlock + blockCnt-1;
		if(eBlock>totalPage) {
			eBlock = totalPage;
		}
	}
}
