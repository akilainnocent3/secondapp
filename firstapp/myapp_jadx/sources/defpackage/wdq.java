package defpackage;

import java.util.Comparator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class wdq {
    public final c5u a;
    public final i6u b;
    public final ts5 c;

    @c0d(c = "com.sportybet.feature.luckynumber.rewardcenter.gift.data.LNGiftRepository$gifts$1", f = "LNGiftRepository.kt", l = {35, 38}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function1<v1b<? super qcn<? extends ocq>>, Object> {
        public int a;

        /* JADX INFO: renamed from: wdq$a$a, reason: collision with other inner class name */
        public static final class C1246a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((ocq) t).f).compareTo(Long.valueOf(((ocq) t2).f));
            }
        }

        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return vl8.b(new rkd0(((ocq) t2).e), new rkd0(((ocq) t).e));
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(1, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(v1b<?> v1bVar) {
            return wdq.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super qcn<? extends ocq>> v1bVar) {
            return ((a) create(v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        
            if (r12 == r0) goto L17;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: wdq.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public wdq(c5u c5uVar, i6u i6uVar) {
        c5uVar.getClass();
        i6uVar.getClass();
        this.a = c5uVar;
        this.b = i6uVar;
        this.c = new ts5(new a(null));
    }
}
