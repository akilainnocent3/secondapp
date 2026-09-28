package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class p6s implements mk10 {
    public final View a;
    public final cmn b;
    public n6s e;
    public iif0 f;
    public z6i0 g;
    public Rect l;
    public final b5s m;
    public Function1<? super List<? extends mof>, Unit> c = new o6s(0);
    public Function1<? super acn, Unit> d = new jt4(1);
    public ijf0 h = new ijf0("", ulf0.b, 4);
    public bcn i = bcn.g;
    public final ArrayList j = new ArrayList();
    public final ttr k = hwr.a(a1s.c, new kt4(this, 2));

    public static final class a {
        public a() {
        }
    }

    public p6s(View view, m80.a.b bVar, cmn cmnVar) {
        this.a = view;
        this.b = cmnVar;
        this.m = new b5s(bVar, cmnVar);
    }

    @Override // defpackage.mk10
    public final ik40 a(EditorInfo editorInfo) {
        int i;
        int i2;
        ijf0 ijf0Var = this.h;
        String str = ijf0Var.a.b;
        long j = ijf0Var.b;
        bcn bcnVar = this.i;
        int i3 = bcnVar.e;
        int i4 = bcnVar.d;
        boolean z = bcnVar.a;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                ib5.a("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        cet cetVar = bcnVar.f;
        if (Intrinsics.g(cetVar, cet.c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(l48.r(cetVar, 10));
            Iterator<bet> it = cetVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = 3;
        } else if (i4 == 5) {
            i2 = 17;
        } else if (i4 == 6) {
            i2 = 33;
        } else if (i4 == 7) {
            i2 = 129;
        } else if (i4 == 8) {
            i2 = 18;
        } else {
            if (i4 != 9) {
                ib5.a("Invalid Keyboard Type");
                return null;
            }
            i2 = 8194;
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 1) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (bcnVar.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 1) == 1) {
            int i5 = bcnVar.b;
            if (i5 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i5 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i5 == 3) {
                i2 |= Http2.INITIAL_MAX_FRAME_SIZE;
                editorInfo.inputType = i2;
            }
            if (bcnVar.c) {
                editorInfo.inputType = 32768 | i2;
            }
        }
        int i6 = ulf0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        wvf.c(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!zbe0.a || i4 == 7 || i4 == 8) {
            if (Build.VERSION.SDK_INT >= 35) {
                wvf.b.a(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                wvf.b.a(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            tvf.a(editorInfo);
        }
        y5s.a aVar = y5s.a;
        if (d.d()) {
            d.a().i(editorInfo);
        }
        ik40 ik40Var = new ik40(this.h, new a(), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(ik40Var));
        return ik40Var;
    }
}
