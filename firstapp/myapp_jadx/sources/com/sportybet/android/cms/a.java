package com.sportybet.android.cms;

import defpackage.anf0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static anf0 a(String str, List list, Function1 function1, Long l) throws CMSError.StringArgNotMatch {
        int i;
        char cCharAt;
        str.getClass();
        list.getClass();
        anf0 anf0Var = (anf0) function1.invoke("");
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            int iS = StringsKt.S(str, '%', i2, 4);
            if (iS == -1) {
                if (i4 < list.size() - 1) {
                    throw new CMSError.StringArgNotMatch(l != null ? l.longValue() : -1L);
                }
                if (i3 < str.length()) {
                    anf0Var.b(str.substring(i3));
                }
                return anf0Var;
            }
            int i5 = iS + 1;
            if (i5 >= str.length() || str.charAt(i5) != '%') {
                int i6 = i5;
                while (i6 < str.length() && Character.isDigit(str.charAt(i6))) {
                    i6++;
                }
                if (i6 <= i5 || i6 >= str.length() || str.charAt(i6) != '$' || (i = i6 + 1) >= str.length() || !((cCharAt = str.charAt(i)) == 'd' || cCharAt == 'f' || cCharAt == 's')) {
                    i2 = i5;
                } else {
                    anf0Var.b(str.substring(i3, iS));
                    int i7 = Integer.parseInt(str.substring(i5, i6)) - 1;
                    Object objV = CollectionsKt.V(i7, list);
                    if (objV == null) {
                        throw new CMSError.StringArgNotMatch(l != null ? l.longValue() : -1L);
                    }
                    if (i4 < i7) {
                        i4 = i7;
                    }
                    anf0Var.c(objV, String.valueOf(cCharAt));
                    i3 = i6 + 2;
                }
            } else {
                anf0Var.b(str.substring(i3, iS));
                anf0Var.b("%");
                i3 = iS + 2;
            }
            i2 = i3;
        }
    }
}
