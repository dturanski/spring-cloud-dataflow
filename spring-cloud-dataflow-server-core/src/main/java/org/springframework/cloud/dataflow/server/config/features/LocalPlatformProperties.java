/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.cloud.dataflow.server.config.features;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.deployer.spi.local.LocalDeployerProperties;

/**
 * @author Mark Pollack
 */
@ConfigurationProperties("spring.cloud.dataflow.task.platform.local")
public class LocalPlatformProperties {

	private Map<String, LocalDeployerProperties> accounts = new LinkedHashMap<>();

	public LocalPlatformProperties() {
	}

	public Map<String, LocalDeployerProperties> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, LocalDeployerProperties> accounts) {
		this.accounts = accounts;
	}
}
