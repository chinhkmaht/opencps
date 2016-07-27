/**
 * OpenCPS is the open source Core Public Services software
 * Copyright (C) 2016-present OpenCPS community
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 */

package org.opencps.api.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.opencps.api.model.ApiService;
import org.opencps.api.model.ApiServiceModel;
import org.opencps.api.model.ApiServiceSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ApiService service. Represents a row in the &quot;opencps_api_log&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.opencps.api.model.ApiServiceModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ApiServiceImpl}.
 * </p>
 *
 * @author trungdk
 * @see ApiServiceImpl
 * @see org.opencps.api.model.ApiService
 * @see org.opencps.api.model.ApiServiceModel
 * @generated
 */
@JSON(strict = true)
public class ApiServiceModelImpl extends BaseModelImpl<ApiService>
	implements ApiServiceModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a api service model instance should use the {@link org.opencps.api.model.ApiService} interface instead.
	 */
	public static final String TABLE_NAME = "opencps_api_log";
	public static final Object[][] TABLE_COLUMNS = {
			{ "apiLogId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "oid", Types.VARCHAR },
			{ "apiCode", Types.VARCHAR },
			{ "ipAddress", Types.VARCHAR },
			{ "httpAgent", Types.VARCHAR },
			{ "params", Types.VARCHAR },
			{ "status", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table opencps_api_log (apiLogId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,oid VARCHAR(75) null,apiCode VARCHAR(75) null,ipAddress VARCHAR(75) null,httpAgent VARCHAR(75) null,params STRING null,status VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table opencps_api_log";
	public static final String ORDER_BY_JPQL = " ORDER BY apiService.apiLogId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY opencps_api_log.apiLogId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.opencps.api.model.ApiService"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.opencps.api.model.ApiService"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static ApiService toModel(ApiServiceSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		ApiService model = new ApiServiceImpl();

		model.setApiLogId(soapModel.getApiLogId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setOid(soapModel.getOid());
		model.setApiCode(soapModel.getApiCode());
		model.setIpAddress(soapModel.getIpAddress());
		model.setHttpAgent(soapModel.getHttpAgent());
		model.setParams(soapModel.getParams());
		model.setStatus(soapModel.getStatus());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<ApiService> toModels(ApiServiceSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<ApiService> models = new ArrayList<ApiService>(soapModels.length);

		for (ApiServiceSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.opencps.api.model.ApiService"));

	public ApiServiceModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _apiLogId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setApiLogId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _apiLogId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return ApiService.class;
	}

	@Override
	public String getModelClassName() {
		return ApiService.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("apiLogId", getApiLogId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("oid", getOid());
		attributes.put("apiCode", getApiCode());
		attributes.put("ipAddress", getIpAddress());
		attributes.put("httpAgent", getHttpAgent());
		attributes.put("params", getParams());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long apiLogId = (Long)attributes.get("apiLogId");

		if (apiLogId != null) {
			setApiLogId(apiLogId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String oid = (String)attributes.get("oid");

		if (oid != null) {
			setOid(oid);
		}

		String apiCode = (String)attributes.get("apiCode");

		if (apiCode != null) {
			setApiCode(apiCode);
		}

		String ipAddress = (String)attributes.get("ipAddress");

		if (ipAddress != null) {
			setIpAddress(ipAddress);
		}

		String httpAgent = (String)attributes.get("httpAgent");

		if (httpAgent != null) {
			setHttpAgent(httpAgent);
		}

		String params = (String)attributes.get("params");

		if (params != null) {
			setParams(params);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	@JSON
	@Override
	public long getApiLogId() {
		return _apiLogId;
	}

	@Override
	public void setApiLogId(long apiLogId) {
		_apiLogId = apiLogId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getOid() {
		if (_oid == null) {
			return StringPool.BLANK;
		}
		else {
			return _oid;
		}
	}

	@Override
	public void setOid(String oid) {
		_oid = oid;
	}

	@JSON
	@Override
	public String getApiCode() {
		if (_apiCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _apiCode;
		}
	}

	@Override
	public void setApiCode(String apiCode) {
		_apiCode = apiCode;
	}

	@JSON
	@Override
	public String getIpAddress() {
		if (_ipAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _ipAddress;
		}
	}

	@Override
	public void setIpAddress(String ipAddress) {
		_ipAddress = ipAddress;
	}

	@JSON
	@Override
	public String getHttpAgent() {
		if (_httpAgent == null) {
			return StringPool.BLANK;
		}
		else {
			return _httpAgent;
		}
	}

	@Override
	public void setHttpAgent(String httpAgent) {
		_httpAgent = httpAgent;
	}

	@JSON
	@Override
	public String getParams() {
		if (_params == null) {
			return StringPool.BLANK;
		}
		else {
			return _params;
		}
	}

	@Override
	public void setParams(String params) {
		_params = params;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_status = status;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			ApiService.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public ApiService toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (ApiService)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ApiServiceImpl apiServiceImpl = new ApiServiceImpl();

		apiServiceImpl.setApiLogId(getApiLogId());
		apiServiceImpl.setCompanyId(getCompanyId());
		apiServiceImpl.setGroupId(getGroupId());
		apiServiceImpl.setUserId(getUserId());
		apiServiceImpl.setCreateDate(getCreateDate());
		apiServiceImpl.setModifiedDate(getModifiedDate());
		apiServiceImpl.setOid(getOid());
		apiServiceImpl.setApiCode(getApiCode());
		apiServiceImpl.setIpAddress(getIpAddress());
		apiServiceImpl.setHttpAgent(getHttpAgent());
		apiServiceImpl.setParams(getParams());
		apiServiceImpl.setStatus(getStatus());

		apiServiceImpl.resetOriginalValues();

		return apiServiceImpl;
	}

	@Override
	public int compareTo(ApiService apiService) {
		long primaryKey = apiService.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ApiService)) {
			return false;
		}

		ApiService apiService = (ApiService)obj;

		long primaryKey = apiService.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<ApiService> toCacheModel() {
		ApiServiceCacheModel apiServiceCacheModel = new ApiServiceCacheModel();

		apiServiceCacheModel.apiLogId = getApiLogId();

		apiServiceCacheModel.companyId = getCompanyId();

		apiServiceCacheModel.groupId = getGroupId();

		apiServiceCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			apiServiceCacheModel.createDate = createDate.getTime();
		}
		else {
			apiServiceCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			apiServiceCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			apiServiceCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		apiServiceCacheModel.oid = getOid();

		String oid = apiServiceCacheModel.oid;

		if ((oid != null) && (oid.length() == 0)) {
			apiServiceCacheModel.oid = null;
		}

		apiServiceCacheModel.apiCode = getApiCode();

		String apiCode = apiServiceCacheModel.apiCode;

		if ((apiCode != null) && (apiCode.length() == 0)) {
			apiServiceCacheModel.apiCode = null;
		}

		apiServiceCacheModel.ipAddress = getIpAddress();

		String ipAddress = apiServiceCacheModel.ipAddress;

		if ((ipAddress != null) && (ipAddress.length() == 0)) {
			apiServiceCacheModel.ipAddress = null;
		}

		apiServiceCacheModel.httpAgent = getHttpAgent();

		String httpAgent = apiServiceCacheModel.httpAgent;

		if ((httpAgent != null) && (httpAgent.length() == 0)) {
			apiServiceCacheModel.httpAgent = null;
		}

		apiServiceCacheModel.params = getParams();

		String params = apiServiceCacheModel.params;

		if ((params != null) && (params.length() == 0)) {
			apiServiceCacheModel.params = null;
		}

		apiServiceCacheModel.status = getStatus();

		String status = apiServiceCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			apiServiceCacheModel.status = null;
		}

		return apiServiceCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{apiLogId=");
		sb.append(getApiLogId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", oid=");
		sb.append(getOid());
		sb.append(", apiCode=");
		sb.append(getApiCode());
		sb.append(", ipAddress=");
		sb.append(getIpAddress());
		sb.append(", httpAgent=");
		sb.append(getHttpAgent());
		sb.append(", params=");
		sb.append(getParams());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("org.opencps.api.model.ApiService");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>apiLogId</column-name><column-value><![CDATA[");
		sb.append(getApiLogId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>oid</column-name><column-value><![CDATA[");
		sb.append(getOid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>apiCode</column-name><column-value><![CDATA[");
		sb.append(getApiCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ipAddress</column-name><column-value><![CDATA[");
		sb.append(getIpAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>httpAgent</column-name><column-value><![CDATA[");
		sb.append(getHttpAgent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>params</column-name><column-value><![CDATA[");
		sb.append(getParams());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = ApiService.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			ApiService.class
		};
	private long _apiLogId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _oid;
	private String _apiCode;
	private String _ipAddress;
	private String _httpAgent;
	private String _params;
	private String _status;
	private ApiService _escapedModel;
}