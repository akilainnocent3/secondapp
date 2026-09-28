package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lryd;", "Lqyd;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ryd extends vpl {
    public final q8i0 f0 = new q8i0(jq40.a(tyd.class), new a(), new c(), new b());

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ryd.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ryd.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ryd.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // defpackage.qyd, defpackage.s62
    public final k72 J0() {
        return (tyd) this.f0.getValue();
    }

    @Override // defpackage.qyd, defpackage.g02
    public final m02 P0() {
        return (tyd) this.f0.getValue();
    }

    @Override // defpackage.qyd
    public final vzd Q0() {
        return (tyd) this.f0.getValue();
    }
}
