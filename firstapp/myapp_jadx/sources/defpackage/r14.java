package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.history.BettingStreakHistoryViewModel$getStreakHistory$1", f = "BettingStreakHistoryViewModel.kt", l = {50}, m = "invokeSuspend", v = 2)
public final class r14 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ s14 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ s14 a;

        public a(s14 s14Var) {
            this.a = s14Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            bxg0 bxg0Var;
            Pair pair;
            String strValueOf;
            Object value;
            Object value2;
            lk50 lk50Var = (lk50) obj;
            s14 s14Var = this.a;
            wwd0 wwd0Var = s14Var.c;
            int i = 2;
            p6e0 p6e0Var = null;
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, q14.a((q14) value2, r6e0.b.a, null, 2)));
            } else if (lk50Var instanceof lk50.a) {
                SprThrowable sprThrowableH = bm50.h(lk50Var);
                UiText uiTextB = sprThrowableH != null ? sprThrowableH.b() : vch0.b;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, q14.a((q14) value, new r6e0.a(uiTextB), null, 2)));
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                while (true) {
                    Object value3 = wwd0Var.getValue();
                    q14 q14Var = (q14) value3;
                    p14 p14Var = s14Var.b;
                    t04 t04Var = (t04) ((lk50.c) lk50Var).a;
                    p14Var.getClass();
                    t04Var.getClass();
                    int i2 = t04Var.b;
                    int i3 = t04Var.a;
                    int i4 = R.string.common_dates__day_lowercase;
                    int i5 = i2 > 1 ? R.string.common_dates__days_lowercase : R.string.common_dates__day_lowercase;
                    if (i3 > 1) {
                        i4 = R.string.common_dates__days_lowercase;
                    }
                    String strA = m58.a(i2, " ");
                    StringUiText stringUiText = vch0.a;
                    p6e0 p6e0Var2 = p6e0Var;
                    ConcatUiText concatUiTextA = ygh.a(i5, new StringUiText(strA));
                    ConcatUiText concatUiTextA2 = ygh.a(i4, new StringUiText(m58.a(i3, " ")));
                    int iOrdinal = t04Var.c.ordinal();
                    if (iOrdinal == 0) {
                        bxg0Var = new bxg0(new j58(u6e0.a), new j58(u6e0.b), new j58(u6e0.c));
                    } else if (iOrdinal == 1) {
                        bxg0Var = new bxg0(new j58(v6e0.a), new j58(v6e0.b), new j58(v6e0.c));
                    } else if (iOrdinal == i) {
                        bxg0Var = new bxg0(new j58(w6e0.a), new j58(w6e0.b), new j58(w6e0.c));
                    } else if (iOrdinal == 3) {
                        bxg0Var = new bxg0(new j58(x6e0.a), new j58(x6e0.b), new j58(x6e0.c));
                    } else if (iOrdinal == 4) {
                        bxg0Var = new bxg0(new j58(y6e0.a), new j58(y6e0.b), new j58(y6e0.c));
                    } else {
                        if (iOrdinal != 5) {
                            uhc.a();
                            return p6e0Var2;
                        }
                        bxg0Var = new bxg0(new j58(z6e0.a), new j58(z6e0.b), new j58(z6e0.c));
                    }
                    long j = ((j58) bxg0Var.a).a;
                    long j2 = ((j58) bxg0Var.b).a;
                    long j3 = ((j58) bxg0Var.c).a;
                    lk50 lk50Var2 = lk50Var;
                    List listK = b.k(new v3l(250.0f), new v3l(55.0f), new v3l(7.0f), new v3l(4.0f));
                    ArrayList arrayList = t04Var.d;
                    ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        int i7 = i6 + 1;
                        c7e0 c7e0Var = (c7e0) arrayList.get(i6);
                        b7e0 b7e0Var = c7e0Var.b;
                        List list = listK;
                        int iOrdinal2 = c7e0Var.c.ordinal();
                        if (iOrdinal2 == 0) {
                            pair = new Pair(new ResourceUiText(R.string.page_loyalty__achieved), new j58(q6e0.a));
                        } else {
                            if (iOrdinal2 != 1) {
                                uhc.a();
                                return p6e0Var2;
                            }
                            pair = new Pair(new ResourceUiText(R.string.page_loyalty__repaired), new j58(q6e0.b));
                        }
                        UiText uiText = (UiText) pair.a;
                        long j4 = ((j58) pair.b).a;
                        StringUiText stringUiTextD = vch0.d(String.valueOf(b7e0Var.b));
                        StringUiText stringUiText2 = new StringUiText(" ");
                        ResourceUiText resourceUiText = new ResourceUiText(R.string.common_dates__days_lowercase);
                        UiText[] uiTextArr = new UiText[3];
                        uiTextArr[0] = stringUiTextD;
                        uiTextArr[1] = stringUiText2;
                        uiTextArr[i] = resourceUiText;
                        ConcatUiText concatUiText = new ConcatUiText(uiTextArr);
                        double d = b7e0Var.c;
                        if (d == 1.0d) {
                            strValueOf = "1";
                        } else {
                            strValueOf = d == 0.0d ? "0" : String.valueOf(d);
                        }
                        arrayList2.add(new d7e0(c7e0Var.a, concatUiText, uiText, j4, new StringUiText(inm.a("x", strValueOf))));
                        i6 = i7;
                        listK = list;
                        j3 = j3;
                        s14Var = s14Var;
                    }
                    s14 s14Var2 = s14Var;
                    r6e0.c cVar = new r6e0.c(new s6e0(concatUiTextA, concatUiTextA2, j, listK, j2, j3, arrayList2));
                    int i8 = i;
                    if (!wwd0Var.g(value3, q14.a(q14Var, cVar, p6e0Var2, i8))) {
                        i = i8;
                        p6e0Var = p6e0Var2;
                        lk50Var = lk50Var2;
                        s14Var = s14Var2;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r14(s14 s14Var, v1b<? super r14> v1bVar) {
        super(2, v1bVar);
        this.b = s14Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new r14(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((r14) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s14 s14Var = this.b;
            yzh yzhVarD = ((c34) s14Var.a.a).d();
            a aVar = new a(s14Var);
            this.a = 1;
            if (yzhVarD.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
