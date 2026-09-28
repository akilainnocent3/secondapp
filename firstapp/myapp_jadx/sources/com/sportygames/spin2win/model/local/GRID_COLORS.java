package com.sportygames.spin2win.model.local;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sportygames/spin2win/model/local/GRID_COLORS;", "", "name", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "RED", "BLACK", "GREEN", "TRANSPARENT", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum GRID_COLORS {
    RED("RED"),
    BLACK("BLACK"),
    GREEN("GREEN"),
    TRANSPARENT("TRANSPARENT");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    GRID_COLORS(String str) {
    }

    public static tag<GRID_COLORS> getEntries() {
        return $ENTRIES;
    }
}
