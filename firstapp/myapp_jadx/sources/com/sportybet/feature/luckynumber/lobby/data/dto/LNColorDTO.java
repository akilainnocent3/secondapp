package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0016Ê\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNColorDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "schemas", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getSchemas", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNColorDTO {
    public static final int $stable = 8;
    private final String id;
    private final List<String> schemas;

    public LNColorDTO(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.id = str;
        this.schemas = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNColorDTO copy$default(LNColorDTO lNColorDTO, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNColorDTO.id;
        }
        if ((i & 2) != 0) {
            list = lNColorDTO.schemas;
        }
        return lNColorDTO.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> component2() {
        return this.schemas;
    }

    public final LNColorDTO copy(String id, List<String> schemas) {
        id.getClass();
        schemas.getClass();
        return new LNColorDTO(id, schemas);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNColorDTO)) {
            return false;
        }
        LNColorDTO lNColorDTO = (LNColorDTO) other;
        return Intrinsics.g(this.id, lNColorDTO.id) && Intrinsics.g(this.schemas, lNColorDTO.schemas);
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getSchemas() {
        return this.schemas;
    }

    public int hashCode() {
        return this.schemas.hashCode() + (this.id.hashCode() * 31);
    }

    public String toString() {
        return nf.b("LNColorDTO(id=", this.id, ", schemas=", ")", this.schemas);
    }
}
