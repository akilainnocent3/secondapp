package defpackage;

import android.graphics.Typeface;
import android.text.Editable;
import android.text.Html;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xml.sax.XMLReader;

/* JADX INFO: loaded from: classes.dex */
public final class jnm {
    public static final a a = new a();

    public static final class a implements Html.TagHandler {
        @Override // android.text.Html.TagHandler
        public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if (xMLReader == null || editable == null || !z || !Intrinsics.g(str, "ContentHandlerReplacementTag")) {
                return;
            }
            xMLReader.setContentHandler(new yk0(xMLReader.getContentHandler(), editable));
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0320  */
    public static nk0 a(String str) {
        String url;
        v1k v1kVar;
        v1k v1kVar2;
        v1k v1kVar3;
        f8i f8iVarA;
        ora0 ora0Var;
        Spanned spannedFromHtml = Html.fromHtml(inm.a("<ContentHandlerReplacementTag />", str), 63, null, a);
        nk0.b bVar = new nk0.b(spannedFromHtml.length());
        bVar.f(spannedFromHtml);
        for (Object obj : spannedFromHtml.getSpans(0, bVar.a.length(), Object.class)) {
            long jA = vlf0.a(spannedFromHtml.getSpanStart(obj), spannedFromHtml.getSpanEnd(obj));
            int i = ulf0.c;
            int i2 = (int) (jA >> 32);
            int i3 = (int) (jA & 4294967295L);
            if (!(obj instanceof AbsoluteSizeSpan)) {
                boolean z = obj instanceof AlignmentSpan;
                ArrayList arrayList = bVar.c;
                int i4 = 3;
                if (z) {
                    Layout.Alignment alignment = ((AlignmentSpan) obj).getAlignment();
                    int i5 = alignment == null ? -1 : b.a[alignment.ordinal()];
                    if (i5 == 1) {
                        i4 = 5;
                    } else if (i5 != 2) {
                        i4 = i5 != 3 ? Integer.MIN_VALUE : 6;
                    }
                    arrayList.add(new nk0.b.a(null, i2, i3, 8, new qrz(i4, null, 510)));
                } else if (obj instanceof zk0) {
                    zk0 zk0Var = (zk0) obj;
                    bVar.c(i2, i3, zk0Var.a, zk0Var.b);
                } else if (obj instanceof BackgroundColorSpan) {
                    bVar.d(new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, r58.b(((BackgroundColorSpan) obj).getBackgroundColor()), (yef0) null, (ix80) null, 63487), i2, i3);
                } else if (obj instanceof jj5) {
                    long j = ij5.e;
                    jj5 jj5Var = (jj5) obj;
                    int i6 = jj5Var.b;
                    d2l.a(j);
                    long jG = d2l.g(omf0.c(j) * i6, 1095216660480L & j);
                    ij5 ij5Var = jj5Var.a;
                    arrayList.add(new nk0.b.a(null, i2, i3, 8, new qrz(0, new pjf0(jG, jG), 503)));
                    arrayList.add(new nk0.b.a(null, i2, i3, 8, ij5Var));
                } else if (obj instanceof ForegroundColorSpan) {
                    bVar.d(new ora0(r58.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65534), i2, i3);
                } else if (obj instanceof RelativeSizeSpan) {
                    bVar.d(new ora0(0L, d2l.g(((RelativeSizeSpan) obj).getSizeChange(), 8589934592L), (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65533), i2, i3);
                } else if (obj instanceof StrikethroughSpan) {
                    bVar.d(new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, yef0.d, (ix80) null, 61439), i2, i3);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        ora0Var = new ora0(0L, 0L, t9i.E, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65531);
                    } else if (style != 2) {
                        ora0Var = style != 3 ? null : new ora0(0L, 0L, t9i.E, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65523);
                    } else {
                        ora0Var = new ora0(0L, 0L, (t9i) null, new n9i(1), (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65527);
                    }
                    if (ora0Var != null) {
                        bVar.d(ora0Var, i2, i3);
                    }
                } else if (obj instanceof SubscriptSpan) {
                    bVar.d(new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, new t82(-0.5f), (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65279), i2, i3);
                } else if (obj instanceof SuperscriptSpan) {
                    bVar.d(new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, new t82(0.5f), (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65279), i2, i3);
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    v1k v1kVar4 = f8i.e;
                    if (!Intrinsics.g(family, v1kVar4.f)) {
                        v1kVar = f8i.d;
                        if (!Intrinsics.g(family, v1kVar.f)) {
                            v1kVar2 = f8i.b;
                            if (!Intrinsics.g(family, v1kVar2.f)) {
                                v1kVar3 = f8i.c;
                                if (!Intrinsics.g(family, v1kVar3.f)) {
                                    String family2 = typefaceSpan.getFamily();
                                    if (family2 == null || family2.length() == 0) {
                                        f8iVarA = v1kVar4;
                                        f8iVarA = v1kVar;
                                        f8iVarA = v1kVar2;
                                        f8iVarA = v1kVar3;
                                        f8iVarA = v1kVar4;
                                        f8iVarA = v1kVar;
                                        f8iVarA = v1kVar2;
                                        f8iVarA = v1kVar3;
                                        f8iVarA = null;
                                    } else {
                                        Typeface typefaceCreate = Typeface.create(family2, 0);
                                        Typeface typeface = Typeface.DEFAULT;
                                        if (Intrinsics.g(typefaceCreate, typeface) || Intrinsics.g(typefaceCreate, Typeface.create(typeface, 0))) {
                                            f8iVarA = v1kVar4;
                                            f8iVarA = v1kVar;
                                            f8iVarA = v1kVar2;
                                            f8iVarA = v1kVar3;
                                            f8iVarA = v1kVar4;
                                            f8iVarA = v1kVar;
                                            f8iVarA = v1kVar2;
                                            f8iVarA = v1kVar3;
                                            typefaceCreate = null;
                                        }
                                        if (typefaceCreate != null) {
                                            f8iVarA = d1a.a(typefaceCreate);
                                        } else {
                                            f8iVarA = v1kVar4;
                                            f8iVarA = v1kVar;
                                            f8iVarA = v1kVar2;
                                            f8iVarA = v1kVar3;
                                            f8iVarA = v1kVar4;
                                            f8iVarA = v1kVar;
                                            f8iVarA = v1kVar2;
                                            f8iVarA = v1kVar3;
                                            f8iVarA = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    f8iVarA = v1kVar4;
                    f8iVarA = v1kVar;
                    f8iVarA = v1kVar2;
                    f8iVarA = v1kVar3;
                    f8iVarA = v1kVar4;
                    f8iVarA = v1kVar;
                    f8iVarA = v1kVar2;
                    f8iVarA = v1kVar4;
                    f8iVarA = v1kVar;
                    f8iVarA = v1kVar4;
                    bVar.d(new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, f8iVarA, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, (yef0) null, (ix80) null, 65503), i2, i3);
                } else if (obj instanceof UnderlineSpan) {
                    bVar.d(new ora0(0L, 0L, (t9i) null, (n9i) null, (o9i) null, (f8i) null, (String) null, 0L, (t82) null, (ljf0) null, (cet) null, 0L, yef0.c, (ix80) null, 61439), i2, i3);
                } else if ((obj instanceof URLSpan) && (url = ((URLSpan) obj).getURL()) != null) {
                    bVar.b(new rfs.b(url, null, null), i2, i3);
                }
            }
        }
        return bVar.m();
    }
}
