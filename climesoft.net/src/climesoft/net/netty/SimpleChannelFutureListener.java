/*
 * Copyright (c) 2015 AsyncHttpClient Project. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at
 *     http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package climesoft.net.netty;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;

public abstract class SimpleChannelFutureListener implements ChannelFutureListener {

  @Override
  public final void operationComplete(ChannelFuture future) {
    Channel channel = future.channel();
    if (future.isSuccess()) {
      onSuccess(channel);
    } else {
      onFailure(channel, future.cause());
    }
  }

  public abstract void onSuccess(Channel channel);

  public abstract void onFailure(Channel channel, Throwable cause);
}
