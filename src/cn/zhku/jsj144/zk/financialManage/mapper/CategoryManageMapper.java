package cn.zhku.jsj144.zk.financialManage.mapper;

import java.util.List;
import java.util.Map;

import cn.zhku.jsj144.zk.financialManage.pojo.ShouzhiCategory;

public interface CategoryManageMapper {

	// 查询收支类别总记录数
	int findCategorysCount(ShouzhiCategory shouzhiCategory);

	// 分页查询收支类别当前页记录列表
	List<ShouzhiCategory> findCategorysCurrentPageList(Map<String, Object> map);

	//判断当前子类型是否存在
	ShouzhiCategory findCategory(ShouzhiCategory shouzhiCategory);

	//添加收支类型
	void insertCategory(ShouzhiCategory shouzhiCategory);

	//通过id查询当前收支类型信息
	ShouzhiCategory queryShouzhiCategoryById(Integer szcid);
	
	//编辑收支类型信息
	void editShouzhiCategory(ShouzhiCategory shouzhiCategory);

	//查找当前收支子类型下的收支记录
	int countShouzhiRecord(int szcid);

	//删除收支子类型
	void deleteShouzhiCategory(int szcid);

	//当前所有收支子类型记录数
	int countShouzhiCategorys();

}
