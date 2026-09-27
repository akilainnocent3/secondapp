package com.unity3d.ads.metadata;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    public PlayerMetaData(Context context) {
        super(context);
        setCategory("player");
    }

    public void setServerId(String str) {
        set(KEY_SERVER_ID, str);
    }
}
