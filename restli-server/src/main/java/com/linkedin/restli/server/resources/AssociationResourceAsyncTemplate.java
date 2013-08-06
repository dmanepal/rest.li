/*
   Copyright (c) 2012 LinkedIn Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

package com.linkedin.restli.server.resources;

import com.linkedin.restli.server.BatchDeleteRequest;
import com.linkedin.restli.server.BatchPatchRequest;
import com.linkedin.restli.server.BatchUpdateRequest;
import com.linkedin.restli.server.BatchUpdateResult;
import com.linkedin.restli.server.PagingContext;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.linkedin.common.callback.Callback;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.restli.common.CompoundKey;
import com.linkedin.restli.common.PatchRequest;
import com.linkedin.restli.server.RoutingException;
import com.linkedin.restli.server.UpdateResponse;



/**
 * Base {@link AssociationResource} implementation. All implementations should extend
 * this.
 *
 * @author femekci
 */
public class AssociationResourceAsyncTemplate<V extends RecordTemplate> extends
    ResourceContextHolder implements AssociationResourceAsync<V>
{

  @Override
  public void batchGet(final Set<CompoundKey> ids,
                       final Callback<Map<CompoundKey, V>> callback)
  {
    throw new RoutingException("'batch_get' not implemented", 400);
  }

  @Override
  public void batchDelete(BatchDeleteRequest<CompoundKey, V> ids, Callback<BatchUpdateResult<CompoundKey, V>> callback)
  {
    throw new RoutingException("'batch_delete' not implemented", 400);
  }

  @Override
  public void batchUpdate(BatchUpdateRequest<CompoundKey, V> entities,
                          Callback<BatchUpdateResult<CompoundKey, V>> callback)
  {
    throw new RoutingException("'batch_update' not implemented", 400);
  }

  @Override
  public void batchUpdate(BatchPatchRequest<CompoundKey, V> patches,
                          Callback<BatchUpdateResult<CompoundKey, V>> callback)
  {
    throw new RoutingException("'batch_patch' not implemented", 400);
  }

  @Override
  public void getAll(PagingContext ctx, Callback<List<V>> callback)
  {
    throw new RoutingException("'get_all' not implemented", 400);
  }

  @Override
  public void get(final CompoundKey key,
                  final Callback<V> callback)
  {
    throw new RoutingException("'get' not implemented", 400);
  }

  @Override
  public void update(final CompoundKey key,
                     final V entity,
                     final Callback<UpdateResponse> callback)
  {
    throw new RoutingException("'update' not implemented", 400);
  }

  @Override
  public void update(final CompoundKey key,
                     final PatchRequest<V> patch,
                     final Callback<UpdateResponse> callback)
  {
    throw new RoutingException("'patch' not implemented", 400);
  }

  @Override
  public void delete(final CompoundKey key,
                     final Callback<UpdateResponse> callback)
  {
    throw new RoutingException("'delete' not implemented", 400);
  }
}
