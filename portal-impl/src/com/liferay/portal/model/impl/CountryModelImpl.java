/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portal.model.impl;

import com.liferay.portal.kernel.bean.ReadOnlyBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.model.Country;
import com.liferay.portal.model.CountrySoap;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.model.impl.ExpandoBridgeImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="CountryModelImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class is a model that represents the <code>Country</code> table
 * in the database.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portal.model.Country
 * @see com.liferay.portal.model.CountryModel
 * @see com.liferay.portal.model.impl.CountryImpl
 *
 */
public class CountryModelImpl extends BaseModelImpl<Country> {
	public static final String TABLE_NAME = "Country";
	public static final Object[][] TABLE_COLUMNS = {
			{ "countryId", new Integer(Types.BIGINT) },
			

			{ "name", new Integer(Types.VARCHAR) },
			

			{ "a2", new Integer(Types.VARCHAR) },
			

			{ "a3", new Integer(Types.VARCHAR) },
			

			{ "number_", new Integer(Types.VARCHAR) },
			

			{ "idd_", new Integer(Types.VARCHAR) },
			

			{ "active_", new Integer(Types.BOOLEAN) }
		};
	public static final String TABLE_SQL_CREATE = "create table Country (countryId LONG not null primary key,name VARCHAR(75) null,a2 VARCHAR(75) null,a3 VARCHAR(75) null,number_ VARCHAR(75) null,idd_ VARCHAR(75) null,active_ BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table Country";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.entity.cache.enabled.com.liferay.portal.model.Country"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.portal.util.PropsUtil.get(
				"value.object.finder.cache.enabled.com.liferay.portal.model.Country"),
			true);

	public static Country toModel(CountrySoap soapModel) {
		Country model = new CountryImpl();

		model.setCountryId(soapModel.getCountryId());
		model.setName(soapModel.getName());
		model.setA2(soapModel.getA2());
		model.setA3(soapModel.getA3());
		model.setNumber(soapModel.getNumber());
		model.setIdd(soapModel.getIdd());
		model.setActive(soapModel.getActive());

		return model;
	}

	public static List<Country> toModels(CountrySoap[] soapModels) {
		List<Country> models = new ArrayList<Country>(soapModels.length);

		for (CountrySoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.portal.util.PropsUtil.get(
				"lock.expiration.time.com.liferay.portal.model.Country"));

	public CountryModelImpl() {
	}

	public long getPrimaryKey() {
		return _countryId;
	}

	public void setPrimaryKey(long pk) {
		setCountryId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_countryId);
	}

	public long getCountryId() {
		return _countryId;
	}

	public void setCountryId(long countryId) {
		_countryId = countryId;
	}

	public String getName() {
		return GetterUtil.getString(_name);
	}

	public void setName(String name) {
		_name = name;

		if (_originalName == null) {
			_originalName = name;
		}
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	public String getA2() {
		return GetterUtil.getString(_a2);
	}

	public void setA2(String a2) {
		_a2 = a2;

		if (_originalA2 == null) {
			_originalA2 = a2;
		}
	}

	public String getOriginalA2() {
		return GetterUtil.getString(_originalA2);
	}

	public String getA3() {
		return GetterUtil.getString(_a3);
	}

	public void setA3(String a3) {
		_a3 = a3;

		if (_originalA3 == null) {
			_originalA3 = a3;
		}
	}

	public String getOriginalA3() {
		return GetterUtil.getString(_originalA3);
	}

	public String getNumber() {
		return GetterUtil.getString(_number);
	}

	public void setNumber(String number) {
		_number = number;
	}

	public String getIdd() {
		return GetterUtil.getString(_idd);
	}

	public void setIdd(String idd) {
		_idd = idd;
	}

	public boolean getActive() {
		return _active;
	}

	public boolean isActive() {
		return _active;
	}

	public void setActive(boolean active) {
		_active = active;
	}

	public Country toEscapedModel() {
		if (isEscapedModel()) {
			return (Country)this;
		}
		else {
			Country model = new CountryImpl();

			model.setNew(isNew());
			model.setEscapedModel(true);

			model.setCountryId(getCountryId());
			model.setName(HtmlUtil.escape(getName()));
			model.setA2(HtmlUtil.escape(getA2()));
			model.setA3(HtmlUtil.escape(getA3()));
			model.setNumber(HtmlUtil.escape(getNumber()));
			model.setIdd(HtmlUtil.escape(getIdd()));
			model.setActive(getActive());

			model = (Country)Proxy.newProxyInstance(Country.class.getClassLoader(),
					new Class[] { Country.class },
					new ReadOnlyBeanHandler(model));

			return model;
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = new ExpandoBridgeImpl(Country.class.getName(),
					getPrimaryKey());
		}

		return _expandoBridge;
	}

	public Object clone() {
		CountryImpl clone = new CountryImpl();

		clone.setCountryId(getCountryId());
		clone.setName(getName());
		clone.setA2(getA2());
		clone.setA3(getA3());
		clone.setNumber(getNumber());
		clone.setIdd(getIdd());
		clone.setActive(getActive());

		return clone;
	}

	public int compareTo(Country country) {
		int value = 0;

		value = getName().compareTo(country.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Country country = null;

		try {
			country = (Country)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = country.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("{countryId=");
		sb.append(getCountryId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", a2=");
		sb.append(getA2());
		sb.append(", a3=");
		sb.append(getA3());
		sb.append(", number=");
		sb.append(getNumber());
		sb.append(", idd=");
		sb.append(getIdd());
		sb.append(", active=");
		sb.append(getActive());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBuilder sb = new StringBuilder();

		sb.append("<model><model-name>");
		sb.append("com.liferay.portal.model.Country");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>countryId</column-name><column-value><![CDATA[");
		sb.append("getCountryId()");
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append("getName()");
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>a2</column-name><column-value><![CDATA[");
		sb.append("getA2()");
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>a3</column-name><column-value><![CDATA[");
		sb.append("getA3()");
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>number</column-name><column-value><![CDATA[");
		sb.append("getNumber()");
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idd</column-name><column-value><![CDATA[");
		sb.append("getIdd()");
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>active</column-name><column-value><![CDATA[");
		sb.append("getActive()");
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _countryId;
	private String _name;
	private String _originalName;
	private String _a2;
	private String _originalA2;
	private String _a3;
	private String _originalA3;
	private String _number;
	private String _idd;
	private boolean _active;
	private transient ExpandoBridge _expandoBridge;
}