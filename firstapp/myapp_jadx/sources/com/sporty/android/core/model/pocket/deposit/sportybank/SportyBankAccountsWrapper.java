package com.sporty.android.core.model.pocket.deposit.sportybank;

import defpackage.at6;
import defpackage.dy5;
import defpackage.gpp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001d¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/SportyBankAccountsWrapper;", "", "pageSize", "", "pageNo", "totalNum", "entityList", "", "Lcom/sporty/android/core/model/pocket/deposit/sportybank/SportyBankAccountDto;", "<init>", "(IIILjava/util/List;)V", "getPageSize", "()I", "getPageNo", "getTotalNum", "getEntityList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyBankAccountsWrapper {
    private final List<SportyBankAccountDto> entityList;
    private final int pageNo;
    private final int pageSize;
    private final int totalNum;

    public SportyBankAccountsWrapper(int i, int i2, int i3, List<SportyBankAccountDto> list) {
        list.getClass();
        this.pageSize = i;
        this.pageNo = i2;
        this.totalNum = i3;
        this.entityList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportyBankAccountsWrapper copy$default(SportyBankAccountsWrapper sportyBankAccountsWrapper, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = sportyBankAccountsWrapper.pageSize;
        }
        if ((i4 & 2) != 0) {
            i2 = sportyBankAccountsWrapper.pageNo;
        }
        if ((i4 & 4) != 0) {
            i3 = sportyBankAccountsWrapper.totalNum;
        }
        if ((i4 & 8) != 0) {
            list = sportyBankAccountsWrapper.entityList;
        }
        return sportyBankAccountsWrapper.copy(i, i2, i3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNo() {
        return this.pageNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    public final List<SportyBankAccountDto> component4() {
        return this.entityList;
    }

    public final SportyBankAccountsWrapper copy(int pageSize, int pageNo, int totalNum, List<SportyBankAccountDto> entityList) {
        entityList.getClass();
        return new SportyBankAccountsWrapper(pageSize, pageNo, totalNum, entityList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportyBankAccountsWrapper)) {
            return false;
        }
        SportyBankAccountsWrapper sportyBankAccountsWrapper = (SportyBankAccountsWrapper) other;
        return this.pageSize == sportyBankAccountsWrapper.pageSize && this.pageNo == sportyBankAccountsWrapper.pageNo && this.totalNum == sportyBankAccountsWrapper.totalNum && Intrinsics.g(this.entityList, sportyBankAccountsWrapper.entityList);
    }

    public final List<SportyBankAccountDto> getEntityList() {
        return this.entityList;
    }

    public final int getPageNo() {
        return this.pageNo;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        return this.entityList.hashCode() + gpp.a(this.totalNum, gpp.a(this.pageNo, Integer.hashCode(this.pageSize) * 31, 31), 31);
    }

    public String toString() {
        int i = this.pageSize;
        int i2 = this.pageNo;
        return at6.b(dy5.a("SportyBankAccountsWrapper(pageSize=", i, i2, ", pageNo=", ", totalNum="), this.totalNum, ", entityList=", this.entityList, ")");
    }
}
