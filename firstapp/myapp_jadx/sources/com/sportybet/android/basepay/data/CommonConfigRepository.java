package com.sportybet.android.basepay.data;

import com.google.protobuf.RuntimeVersion;
import defpackage.c0d;
import defpackage.dc8;
import defpackage.ej5;
import defpackage.fse;
import defpackage.mg8;
import defpackage.ng50;
import defpackage.ng8;
import defpackage.odd;
import defpackage.pfd;
import defpackage.psm;
import defpackage.ta8;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH$¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0084@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u0002H$¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/sportybet/android/basepay/data/CommonConfigRepository;", "T", "", "Lta8;", "apiService", "Lpsm;", "countryManager", "<init>", "(Lta8;Lpsm;)V", "", "Ldc8$a;", "buildParams", "()Ljava/util/List;", "Lng50;", "getConfig", "(Lv1b;)Ljava/lang/Object;", "data", "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lta8;", "Lpsm;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CommonConfigRepository<T> {
    public static final int $stable = 0;
    private final ta8 apiService;
    private final psm countryManager;

    /* JADX INFO: renamed from: com.sportybet.android.basepay.data.CommonConfigRepository$getConfig$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lv5b;", "Lng50;", "<anonymous>", "(Lv5b;)Lng50;"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.basepay.data.CommonConfigRepository$getConfig$2", f = "CommonConfigRepository.kt", l = {24, RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends tje0 implements Function2<v5b, v1b<? super ng50<T>>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ CommonConfigRepository<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CommonConfigRepository<T> commonConfigRepository, v1b<? super AnonymousClass2> v1bVar) {
            super(2, v1bVar);
            this.this$0 = commonConfigRepository;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new AnonymousClass2(this.this$0, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super ng50<T>> v1bVar) {
            return ((AnonymousClass2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        
            if (r10 == r0) goto L27;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 212
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.basepay.data.CommonConfigRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public CommonConfigRepository(ta8 ta8Var, psm psmVar) {
        ta8Var.getClass();
        psmVar.getClass();
        this.apiService = ta8Var;
        this.countryManager = psmVar;
    }

    public abstract List<dc8.a> buildParams();

    public Object c(ng8 ng8Var) {
        return getConfig(ng8Var);
    }

    public abstract T convert(Object data);

    public Object d(mg8 mg8Var) {
        return getConfig(mg8Var);
    }

    public final Object getConfig(v1b<? super ng50<T>> v1bVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new AnonymousClass2(this, null), v1bVar);
    }
}
