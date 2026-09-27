package com.startapp.sdk.adsbase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseResponse implements Serializable {
    private static final long serialVersionUID = 3276484898993249723L;
    protected Map<String, String> parameters = new HashMap();
    private boolean validResponse = true;
    private String errorMessage = null;

    public final String a() {
        return this.errorMessage;
    }

    public final boolean b() {
        return this.validResponse;
    }
}
