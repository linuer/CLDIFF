package edu.fdu.se.mapper;

import edu.fdu.se.bean.AndroidSDKJavaFile;
import edu.fdu.se.bean.AndroidSDKJavaFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;



public interface AndroidSDKJavaFileMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_sdk_java_file
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	long countByExample(AndroidSDKJavaFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_sdk_java_file
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int deleteByExample(AndroidSDKJavaFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_sdk_java_file
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int insert(AndroidSDKJavaFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_sdk_java_file
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int insertSelective(AndroidSDKJavaFile record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_sdk_java_file
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	List<AndroidSDKJavaFile> selectByExample(AndroidSDKJavaFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_sdk_java_file
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int updateByExampleSelective(@Param("record") AndroidSDKJavaFile record,
			@Param("example") AndroidSDKJavaFileExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table android_sdk_java_file
	 * @mbg.generated  Sat Dec 30 14:47:32 CST 2017
	 */
	int updateByExample(@Param("record") AndroidSDKJavaFile record,
			@Param("example") AndroidSDKJavaFileExample example);

	int insertBatch(List<AndroidSDKJavaFile> androidsdkjavafile);
	
	List<AndroidSDKJavaFile> selectByFileName(@Param(value = "fileName") String fileName);
	
	List<AndroidSDKJavaFile> selectByFileNameAndFilterSupportPackage(@Param(value = "fileName")String fileName);
	
	List<AndroidSDKJavaFile> selectAllFileBySDKVersion(@Param(value = "versionId")int versionId);
}