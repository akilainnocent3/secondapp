package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", l = {402}, m = "invokeSuspend")
public final class htu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ftu b;

    @c0d(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {416, 418, 422, 422}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<Float, v1b<? super Unit>, Object> {
        public xi0 a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ftu d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ftu ftuVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = ftuVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Float f, v1b<? super Unit> v1bVar) {
            return ((a) create(f, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00cd, code lost:
        
            if (r7.f(r20, r0) == r8) goto L40;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 232
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: htu.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htu(ftu ftuVar, v1b<? super htu> v1bVar) {
        super(2, v1bVar);
        this.b = ftuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new htu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((htu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final ftu ftuVar = this.b;
            or60 or60VarC = n95.c(new Function0() { // from class: gtu
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ftu ftuVar2 = ftuVar;
                    osw oswVar = ftuVar2.H;
                    if (((u5a0) oswVar).D() <= ((u5a0) ftuVar2.I).D()) {
                        return null;
                    }
                    ((atu) ((x5a0) ftuVar2.N).getValue()).getClass();
                    return Float.valueOf(ftuVar2.q2() + ((u5a0) oswVar).D());
                }
            });
            a aVar = new a(ftuVar, null);
            this.a = 1;
            if (kzh.b(or60VarC, aVar, this) == y5bVar) {
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
