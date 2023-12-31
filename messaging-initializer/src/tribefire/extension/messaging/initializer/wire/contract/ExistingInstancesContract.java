// ============================================================================
// Copyright BRAINTRIBE TECHNOLOGY GMBH, Austria, 2002-2022
// 
// This library is free software; you can redistribute it and/or modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
// 
// This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more details.
// 
// You should have received a copy of the GNU Lesser General Public License along with this library; See http://www.gnu.org/licenses/.
// ============================================================================
package tribefire.extension.messaging.initializer.wire.contract;

import com.braintribe.model.deployment.Module;
import com.braintribe.model.meta.GmEntityType;
import com.braintribe.model.meta.GmMetaModel;
import com.braintribe.wire.api.space.WireSpace;

import tribefire.cortex.initializer.support.impl.lookup.GlobalId;
import tribefire.cortex.initializer.support.impl.lookup.InstanceLookup;
import tribefire.extension.messaging.MessagingConstants;

@InstanceLookup(lookupOnly = true)
public interface ExistingInstancesContract extends WireSpace {

	@GlobalId(MessagingConstants.MODULE_GLOBAL_ID)
	Module module();

	// -----------------------------------------------------------------------
	// MODELS
	// -----------------------------------------------------------------------

	@GlobalId("model:" + MessagingConstants.DEPLOYMENT_MODEL_QUALIFIEDNAME)
	GmMetaModel deploymentModel();

	@GlobalId("model:" + MessagingConstants.SERVICE_MODEL_QUALIFIEDNAME)
	GmMetaModel serviceModel();

	@GlobalId("wire://MessagingMetaDataSpace/serviceModel/$-default")
	GmMetaModel defaultConfiguredServiceModel();

	@GlobalId("type:com.braintribe.model.generic.GenericEntity")
	GmEntityType genericEntityType();

	// TODO: what should this be???
	@GlobalId("wire://MessagingMetaDataSpace/serviceModel/default-producer")
	GmMetaModel messagingProducerServiceModel();

	// TODO: what should this be???
	@GlobalId("wire://MessagingMetaDataSpace/serviceModel/default-consumer")
	GmMetaModel messagingConsumerServiceModel();

}
