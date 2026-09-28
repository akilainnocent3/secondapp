package com.sportygames.commons.models.enums;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sportygames/commons/models/enums/PagingFetchType;", "", "type", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "VIEW_MORE", "ARCHIVE_MORE", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum PagingFetchType {
    VIEW_MORE("view_more"),
    ARCHIVE_MORE("archive_more");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String type;

    PagingFetchType(String str) {
        this.type = str;
    }

    public static tag<PagingFetchType> getEntries() {
        return $ENTRIES;
    }

    public final String getType() {
        return this.type;
    }
}
