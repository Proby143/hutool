package com.xiaoleilu.hutool.convert.impl;

import com.xiaoleilu.hutool.convert.AbstractConverter;
import com.xiaoleilu.hutool.convert.ConverterRegistry;
import com.xiaoleilu.hutool.util.ArrayUtil;

/**
 * boolean类型数组转换器
 * @author Looly
 *
 */
public class BooleanArrayConverter extends AbstractConverter<boolean[]>{
	
	@Override
	protected boolean[] convertInternal(Object value) {
		final Boolean[] result = ConverterRegistry.getInstance().convert(Boolean[].class, value);
		return ArrayUtil.unWrap(result);
	}

}
