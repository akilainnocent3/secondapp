package defpackage;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class gnm {
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:86:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x013e  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void a(d dVar, final String str, final int i, final int i2, int i3, boolean z, a aVar, final int i4, final int i5) {
        final d dVar2;
        int i6;
        int i7;
        int i8;
        boolean z2;
        int i9;
        boolean z3;
        final boolean z4;
        final int i10;
        e eVarZ;
        d dVar3;
        final int i11;
        int i12;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        Object objY;
        boolean z10;
        boolean z11;
        Object objY2;
        str.getClass();
        b bVarI = aVar.i(-241992351);
        int i13 = i5 & 1;
        if (i13 != 0) {
            i6 = i4 | 6;
            dVar2 = dVar;
        } else if ((i4 & 6) == 0) {
            dVar2 = dVar;
            i6 = (bVarI.M(dVar2) ? 4 : 2) | i4;
        } else {
            dVar2 = dVar;
            i6 = i4;
        }
        int i14 = i6 | (bVarI.M(str) ? 32 : 16) | (bVarI.d(i) ? 256 : 128) | (bVarI.d(i2) ? 2048 : 1024);
        int i15 = i5 & 16;
        if (i15 == 0) {
            if ((i4 & 24576) == 0) {
                i7 = i3;
                i14 |= bVarI.d(i7) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
            }
            i8 = i5 & 32;
            if (i8 != 0) {
                i14 |= 196608;
                z2 = z;
            } else {
                z2 = z;
                if ((i4 & 196608) == 0) {
                    if (bVarI.b(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i14 |= i9;
                }
            }
            if ((i14 & 74899) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVarI.q(i14 & 1, z3)) {
                if (i13 != 0) {
                    dVar3 = d.a.b;
                } else {
                    dVar3 = dVar2;
                }
                if (i15 != 0) {
                    i11 = 8388611;
                } else {
                    i11 = i7;
                }
                if (i8 != 0) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                i12 = i14 & 896;
                if (i12 == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((i14 & 7168) == 2048) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z12 = z6 | z5;
                if ((57344 & i14) == 16384) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                boolean z13 = z12 | z7;
                if ((458752 & i14) == 131072) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = z13 | z8;
                objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z9 || objY == c0042a) {
                    objY = new Function1() { // from class: dnm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            context.getClass();
                            TextView textView = new TextView(context);
                            textView.setTextColor(textView.getContext().getColor(i));
                            textView.setTextAppearance(i2);
                            textView.setGravity(i11);
                            textView.setIncludeFontPadding(z4);
                            return textView;
                        }
                    };
                    bVarI.r(objY);
                }
                Function1 function1 = (Function1) objY;
                if ((i14 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 = z10 | (i12 == 256);
                objY2 = bVarI.y();
                if (z11 || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: enm
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            TextView textView = (TextView) obj;
                            textView.getClass();
                            Spanned spannedFromHtml = Html.fromHtml(str, 0);
                            spannedFromHtml.getClass();
                            textView.setText(StringsKt.t0(spannedFromHtml));
                            textView.setTextColor(textView.getContext().getColor(i));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                d dVar4 = dVar3;
                androidx.compose.ui.viewinterop.b.a(function1, dVar4, (Function1) objY2, bVarI, (i14 << 3) & 112, 0);
                i10 = i11;
                dVar2 = dVar4;
            } else {
                bVarI.G();
                z4 = z2;
                i10 = i7;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: fnm
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        gnm.a(dVar2, str, i, i2, i10, z4, (a) obj, qj40.a(i4 | 1), i5);
                        return Unit.a;
                    }
                };
            }
        }
        i14 |= 24576;
        i7 = i3;
        i8 = i5 & 32;
        if (i8 != 0) {
            i14 |= 196608;
            z2 = z;
        } else {
            z2 = z;
            if ((i4 & 196608) == 0) {
                if (bVarI.b(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i14 |= i9;
            }
        }
        if ((i14 & 74899) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (bVarI.q(i14 & 1, z3)) {
            if (i13 != 0) {
                dVar3 = d.a.b;
            } else {
                dVar3 = dVar2;
            }
            if (i15 != 0) {
                i11 = 8388611;
            } else {
                i11 = i7;
            }
            if (i8 != 0) {
                z4 = true;
            } else {
                z4 = z2;
            }
            i12 = i14 & 896;
            if (i12 == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i14 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z14 = z6 | z5;
            if ((57344 & i14) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z15 = z14 | z7;
            if ((458752 & i14) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = z15 | z8;
            objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z9) {
                objY = new Function1() { // from class: dnm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        TextView textView = new TextView(context);
                        textView.setTextColor(textView.getContext().getColor(i));
                        textView.setTextAppearance(i2);
                        textView.setGravity(i11);
                        textView.setIncludeFontPadding(z4);
                        return textView;
                    }
                };
                bVarI.r(objY);
            } else {
                objY = new Function1() { // from class: dnm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Context context = (Context) obj;
                        context.getClass();
                        TextView textView = new TextView(context);
                        textView.setTextColor(textView.getContext().getColor(i));
                        textView.setTextAppearance(i2);
                        textView.setGravity(i11);
                        textView.setIncludeFontPadding(z4);
                        return textView;
                    }
                };
                bVarI.r(objY);
            }
            Function1 function2 = (Function1) objY;
            if ((i14 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            z11 = z10 | (i12 == 256);
            objY2 = bVarI.y();
            if (z11) {
                objY2 = new Function1() { // from class: enm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TextView textView = (TextView) obj;
                        textView.getClass();
                        Spanned spannedFromHtml = Html.fromHtml(str, 0);
                        spannedFromHtml.getClass();
                        textView.setText(StringsKt.t0(spannedFromHtml));
                        textView.setTextColor(textView.getContext().getColor(i));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            } else {
                objY2 = new Function1() { // from class: enm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TextView textView = (TextView) obj;
                        textView.getClass();
                        Spanned spannedFromHtml = Html.fromHtml(str, 0);
                        spannedFromHtml.getClass();
                        textView.setText(StringsKt.t0(spannedFromHtml));
                        textView.setTextColor(textView.getContext().getColor(i));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            d dVar5 = dVar3;
            androidx.compose.ui.viewinterop.b.a(function2, dVar5, (Function1) objY2, bVarI, (i14 << 3) & 112, 0);
            i10 = i11;
            dVar2 = dVar5;
        } else {
            bVarI.G();
            z4 = z2;
            i10 = i7;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: fnm
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gnm.a(dVar2, str, i, i2, i10, z4, (a) obj, qj40.a(i4 | 1), i5);
                    return Unit.a;
                }
            };
        }
    }
}
