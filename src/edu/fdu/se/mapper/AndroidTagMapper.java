package edu.fdu.se.mapper;

import edu.fdu.se.bean.AndroidTag;
import edu.fdu.se.bean.AndroidTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AndroidTagMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	long countByExample(AndroidTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int deleteByExample(AndroidTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int insert(AndroidTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int insertSelective(AndroidTag record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	List<AndroidTag> selectByExample(AndroidTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int updateByExampleSelective(@Param("record") AndroidTag record, @Param("example") AndroidTagExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_tag
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int updateByExample(@Param("record") AndroidTag record, @Param("example") AndroidTagExample example);

	List<AndroidTag> selectAll();
	
	List<AndroidTag> selectTags(@Param("tagShortName")String tagShortName);
	
	AndroidTag selectTagByShortNameAndProjName(@Param("tagShortName") String tagShortName,@Param("projectName")String projectName);
	
	List<AndroidTag> selectTagAll(@Param("projectName")String projectName);
}