package com.chendianqv.pool;

import java.nio.channels.SocketChannel;
public interface Worker {
	
	/**
	 * 加入一个新的客户端会话
	 * @param channel
	 */
	void registerNewChannelTask(SocketChannel channel);

}
