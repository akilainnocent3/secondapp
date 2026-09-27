package com.startapp.sdk.internal;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sf f74799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f74800b;

    public fa(sf sfVar) {
        this.f74799a = sfVar;
    }

    public final String a() {
        String string;
        String str = this.f74800b;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            try {
                string = this.f74800b;
                if (string == null) {
                    string = this.f74799a.getString("e695c6d894060903", null);
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        rf rfVarEdit = this.f74799a.edit();
                        rfVarEdit.a("e695c6d894060903", string);
                        rfVarEdit.f75462a.putString("e695c6d894060903", string);
                        if (!rfVarEdit.f75462a.commit()) {
                            string = "00000000-0000-0000-0000-000000000000";
                        }
                    }
                    this.f74800b = string;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }
}
