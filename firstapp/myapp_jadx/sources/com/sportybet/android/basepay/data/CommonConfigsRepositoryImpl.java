package com.sportybet.android.basepay.data;

import com.google.protobuf.RuntimeVersion;
import defpackage.c0d;
import defpackage.dc8;
import defpackage.ej5;
import defpackage.fc8;
import defpackage.fse;
import defpackage.ng50;
import defpackage.odd;
import defpackage.pfd;
import defpackage.psm;
import defpackage.ta8;
import defpackage.tje0;
import defpackage.v1b;
import defpackage.v5b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000b2\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/sportybet/android/basepay/data/CommonConfigsRepositoryImpl;", "Lfc8;", "Lpsm;", "countryManager", "Lta8;", "apiService", "<init>", "(Lpsm;Lta8;)V", "", "Ldc8$a;", "parameters", "Lng50;", "", "", "", "getConfigs", "([Ldc8$a;Lv1b;)Ljava/lang/Object;", "Lpsm;", "Lta8;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CommonConfigsRepositoryImpl implements fc8 {
    public static final int $stable = 0;
    private final ta8 apiService;
    private final psm countryManager;

    public CommonConfigsRepositoryImpl(psm psmVar, ta8 ta8Var) {
        psmVar.getClass();
        ta8Var.getClass();
        this.countryManager = psmVar;
        this.apiService = ta8Var;
    }

    @Override // defpackage.fc8
    public Object getConfigs(dc8.a[] aVarArr, v1b<? super ng50<Map<String, Object>>> v1bVar) {
        pfd pfdVar = fse.a;
        return ej5.d(odd.b, new AnonymousClass2(aVarArr, null), v1bVar);
    }

    /* JADX INFO: renamed from: com.sportybet.android.basepay.data.CommonConfigsRepositoryImpl$getConfigs$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv5b;", "Lng50;", "", "", "", "<anonymous>", "(Lv5b;)Lng50;"}, k = 3, mv = {2, 4, 0})
    @c0d(c = "com.sportybet.android.basepay.data.CommonConfigsRepositoryImpl$getConfigs$2", f = "CommonConfigsRepositoryImpl.kt", l = {RuntimeVersion.MINOR, 28}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends tje0 implements Function2<v5b, v1b<? super ng50<Map<String, ? extends Object>>>, Object> {
        final /* synthetic */ dc8.a[] $parameters;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dc8.a[] aVarArr, v1b<? super AnonymousClass2> v1bVar) {
            super(2, v1bVar);
            this.$parameters = aVarArr;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return CommonConfigsRepositoryImpl.this.new AnonymousClass2(this.$parameters, v1bVar);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(v5b v5bVar, v1b<? super ng50<Map<String, Object>>> v1bVar) {
            return ((AnonymousClass2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
        
            if (r13 == r0) goto L27;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.basepay.data.CommonConfigsRepositoryImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(v5b v5bVar, v1b<? super ng50<Map<String, ? extends Object>>> v1bVar) {
            return invoke2(v5bVar, (v1b<? super ng50<Map<String, Object>>>) v1bVar);
        }
    }
}
