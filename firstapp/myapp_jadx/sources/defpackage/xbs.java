package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class xbs<Value> extends wqz<Integer, Value> {
    public final bw50 b;
    public final lv50 c;
    public final ud8<Value> d;

    public static final /* synthetic */ class a extends saj implements gaj<bw50, Integer, v1b<? super List<? extends Value>>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(bw50 bw50Var, Integer num, Object obj) {
            return ((xbs) this.receiver).e(bw50Var, num.intValue(), (v1b) obj);
        }
    }

    public xbs(bw50 bw50Var, lv50 lv50Var, String... strArr) {
        lv50Var.getClass();
        this.b = bw50Var;
        this.c = lv50Var;
        this.d = new ud8<>(strArr, this, new a(3, this, xbs.class, "convertRows", "convertRows(Landroidx/room/RoomRawQuery;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0));
    }

    @Override // defpackage.wqz
    public final Integer b(xqz xqzVar) {
        Integer num = xqzVar.b;
        if (num != null) {
            return Integer.valueOf(Math.max(0, num.intValue() - (xqzVar.c.d / 2)));
        }
        return null;
    }

    @Override // defpackage.wqz
    public final Object d(wqz.a aVar, x1b x1bVar) {
        return this.d.a(aVar, x1bVar);
    }

    public Object e(final bw50 bw50Var, final int i, v1b<? super List<? extends Value>> v1bVar) {
        return qlc.c(v1bVar, this.c, new Function1(this, i) { // from class: wbs
            public final /* synthetic */ int b;

            {
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = this.b;
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                bw50 bw50Var2 = this.a;
                hq60 hq60VarH1 = vp60Var.H1(bw50Var2.a);
                try {
                    bw50Var2.b.invoke(hq60VarH1);
                    new iq60(hq60VarH1, i2);
                    throw new czx("Unexpected call to a function with no implementation that Room is suppose to generate. Please file a bug at: https://issuetracker.google.com/issues/new?component=413107&template=1096568.");
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vc1.a(hq60VarH1, th);
                        throw th2;
                    }
                }
            }
        }, true, false);
    }
}
