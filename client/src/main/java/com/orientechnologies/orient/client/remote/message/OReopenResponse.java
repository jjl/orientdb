package com.orientechnologies.orient.client.remote.message;

import java.io.IOException;

import com.orientechnologies.orient.client.remote.OBinaryResponse;
import com.orientechnologies.orient.client.remote.OStorageRemoteSession;
import com.orientechnologies.orient.enterprise.channel.binary.OChannelDataInput;
import com.orientechnologies.orient.enterprise.channel.binary.OChannelDataOutput;

public class OReopenResponse implements OBinaryResponse {
  private int sessionId;

  public OReopenResponse() {
  }

  public OReopenResponse(int sessionId) {
    this.sessionId = sessionId;
  }

  @Override
  public void write(OChannelDataOutput channel, int protocolVersion, String recordSerializer) throws IOException {
    channel.writeInt(sessionId);
  }

  @Override
  public void read(OChannelDataInput network, OStorageRemoteSession session) throws IOException {
    sessionId = network.readInt();
  }

  public int getSessionId() {
    return sessionId;
  }
}