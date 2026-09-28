package com.sportygames.cms.remote.models;

import defpackage.xbp;
import defpackage.xdp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sportygames/cms/remote/models/CMSResponse;", "", "Lxdp;", "keys", "", "version", "<init>", "(Lxdp;Ljava/lang/String;)V", "copy", "(Lxdp;Ljava/lang/String;)Lcom/sportygames/cms/remote/models/CMSResponse;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CMSResponse {
    public final xdp a;
    public final String b;

    public CMSResponse(@xbp(name = "keys") xdp xdpVar, @xbp(name = "version") String str) {
        xdpVar.getClass();
        str.getClass();
        this.a = xdpVar;
        this.b = str;
    }

    public final CMSResponse copy(@xbp(name = "keys") xdp keys, @xbp(name = "version") String version) {
        keys.getClass();
        version.getClass();
        return new CMSResponse(keys, version);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CMSResponse)) {
            return false;
        }
        CMSResponse cMSResponse = (CMSResponse) obj;
        return Intrinsics.g(this.a, cMSResponse.a) && Intrinsics.g(this.b, cMSResponse.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "CMSResponse(keys=" + this.a + ", version=" + this.b + ")";
    }
}
