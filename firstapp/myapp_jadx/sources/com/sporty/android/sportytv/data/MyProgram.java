package com.sporty.android.sportytv.data;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/sportytv/data/MyProgram;", "", "flag", "", "programList", "", "Lcom/sporty/android/sportytv/data/Program;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFlag", "()Ljava/lang/String;", "getProgramList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sportyMedia", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MyProgram {
    public static final int $stable = 8;
    private final String flag;
    private final List<Program> programList;

    public MyProgram(String str, List<Program> list) {
        this.flag = str;
        this.programList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyProgram copy$default(MyProgram myProgram, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = myProgram.flag;
        }
        if ((i & 2) != 0) {
            list = myProgram.programList;
        }
        return myProgram.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFlag() {
        return this.flag;
    }

    public final List<Program> component2() {
        return this.programList;
    }

    public final MyProgram copy(String flag, List<Program> programList) {
        return new MyProgram(flag, programList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyProgram)) {
            return false;
        }
        MyProgram myProgram = (MyProgram) other;
        return Intrinsics.g(this.flag, myProgram.flag) && Intrinsics.g(this.programList, myProgram.programList);
    }

    public final String getFlag() {
        return this.flag;
    }

    public final List<Program> getProgramList() {
        return this.programList;
    }

    public int hashCode() {
        String str = this.flag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Program> list = this.programList;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return nf.b("MyProgram(flag=", this.flag, ", programList=", ")", this.programList);
    }
}
