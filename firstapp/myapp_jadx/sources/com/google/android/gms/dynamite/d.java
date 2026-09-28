package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0190b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0190b c0190b = new DynamiteModule.b.C0190b();
        int iB = aVar.b(context, str);
        c0190b.a = iB;
        int i = 1;
        int i2 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0190b.b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0190b.b = iA;
        }
        int i3 = c0190b.a;
        if (i3 == 0) {
            if (iA == 0) {
                i = 0;
            }
            c0190b.c = i;
            return c0190b;
        }
        i2 = i3;
        if (i2 >= iA) {
            i = -1;
        }
        c0190b.c = i;
        return c0190b;
    }
}
