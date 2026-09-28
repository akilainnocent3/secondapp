package com.sportygames.commons.remote.model;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportygames/commons/remote/model/Status;", "", "<init>", "(Ljava/lang/String;I)V", "RUNNING", "SUCCESS", "FAILED", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum Status {
    RUNNING,
    SUCCESS,
    FAILED;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<Status> getEntries() {
        return $ENTRIES;
    }
}
