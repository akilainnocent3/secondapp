package com.sporty.android.core.model.pocket.common;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/ClabeResponse;", "", "clabe", "", "type", "Lcom/sporty/android/core/model/pocket/common/ClabeType;", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/pocket/common/ClabeType;)V", "getClabe", "()Ljava/lang/String;", "getType", "()Lcom/sporty/android/core/model/pocket/common/ClabeType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ClabeResponse {
    private final String clabe;
    private final ClabeType type;

    public ClabeResponse(String str, ClabeType clabeType) {
        str.getClass();
        clabeType.getClass();
        this.clabe = str;
        this.type = clabeType;
    }

    public static /* synthetic */ ClabeResponse copy$default(ClabeResponse clabeResponse, String str, ClabeType clabeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = clabeResponse.clabe;
        }
        if ((i & 2) != 0) {
            clabeType = clabeResponse.type;
        }
        return clabeResponse.copy(str, clabeType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getClabe() {
        return this.clabe;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ClabeType getType() {
        return this.type;
    }

    public final ClabeResponse copy(String clabe, ClabeType type) {
        clabe.getClass();
        type.getClass();
        return new ClabeResponse(clabe, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClabeResponse)) {
            return false;
        }
        ClabeResponse clabeResponse = (ClabeResponse) other;
        return Intrinsics.g(this.clabe, clabeResponse.clabe) && this.type == clabeResponse.type;
    }

    public final String getClabe() {
        return this.clabe;
    }

    public final ClabeType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.clabe.hashCode() * 31);
    }

    public String toString() {
        return "ClabeResponse(clabe=" + this.clabe + ", type=" + this.type + ")";
    }
}
