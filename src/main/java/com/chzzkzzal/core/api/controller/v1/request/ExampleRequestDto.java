package com.chzzkzzal.core.api.controller.v1.request;

import com.chzzkzzal.zzal.domain.dto.ExampleData;

public record ExampleRequestDto(String data) {
	public ExampleData toExampleData() {
		return new ExampleData(data, data);
	}
}
