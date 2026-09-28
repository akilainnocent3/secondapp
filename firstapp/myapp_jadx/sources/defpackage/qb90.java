package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqb90;", "Lavw;", "Lnb90;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qb90 extends avw<nb90> {
    public final qfk e;
    public final w8k f;
    public final gfy i;
    public jvd0 v;
    public final v340 w;

    @c0d(c = "com.sportybet.android.limits.base.timelimits.viewmodel.ShowTimeLimitsViewModel$uiState$1", f = "ShowTimeLimitsViewModel.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<nb90, fwf0, v1b<? super nb90>, Object> {
        public int a;
        public /* synthetic */ nb90 b;
        public /* synthetic */ fwf0 c;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(nb90 nb90Var, fwf0 fwf0Var, v1b<? super nb90> v1bVar) {
            a aVar = qb90.this.new a(v1bVar);
            aVar.b = nb90Var;
            aVar.c = fwf0Var;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nb90 nb90Var = this.b;
            fwf0 fwf0Var = this.c;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (!(nb90Var instanceof nb90.c)) {
                    return nb90Var;
                }
                this.b = null;
                this.c = null;
                this.a = 1;
                obj = qb90.this.z1(fwf0Var, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return (nb90) obj;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public qb90(qfk qfkVar, w8k w8kVar, gfy gfyVar) {
        nb90.b bVar = nb90.b.a;
        super(bVar);
        this.e = qfkVar;
        this.f = w8kVar;
        this.i = gfyVar;
        this.w = e1i.e(new n1i(this.a, gfyVar.a.k(), new a(null)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(fwf0 fwf0Var, x1b x1bVar) {
        ob90 ob90Var;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        if (x1bVar instanceof ob90) {
            ob90Var = (ob90) x1bVar;
            int i = ob90Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ob90Var.i = i - Integer.MIN_VALUE;
            } else {
                ob90Var = new ob90(this, x1bVar);
            }
        } else {
            ob90Var = new ob90(this, x1bVar);
        }
        Object obj = ob90Var.e;
        y5b y5bVar = y5b.a;
        int i2 = ob90Var.i;
        Integer num6 = null;
        if (i2 == 0) {
            uj50.b(obj);
            Integer num7 = fwf0Var.a;
            int i3 = fwf0Var.f;
            Integer num8 = fwf0Var.b;
            if (num8 != null) {
                num = new Integer((i3 / 60) + num8.intValue());
            } else {
                num = null;
            }
            Integer num9 = fwf0Var.c;
            Integer num10 = fwf0Var.d;
            if (num10 != null) {
                num6 = new Integer((i3 / 60) + num10.intValue());
            }
            ob90Var.a = num7;
            ob90Var.b = num;
            ob90Var.c = num9;
            ob90Var.d = num6;
            ob90Var.i = 1;
            Object objA = this.f.a(ob90Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
            num2 = num7;
            num3 = num6;
            num4 = num;
            num5 = num9;
            obj = objA;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Integer num11 = ob90Var.d;
            Integer num12 = ob90Var.c;
            Integer num13 = ob90Var.b;
            Integer num14 = ob90Var.a;
            uj50.b(obj);
            num3 = num11;
            num5 = num12;
            num2 = num14;
            num4 = num13;
        }
        return new nb90.c(((w8k.a) obj).a, num2, num4, num5, num3);
    }
}
