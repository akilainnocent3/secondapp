package defpackage;

import android.view.textclassifier.TextClassifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2", f = "PlatformSelectionBehaviors.android.kt", l = {351, 256, 265}, m = "invokeSuspend")
public final class bk10 extends tje0 implements Function2<v5b, v1b<Object>, Object> {
    public quw a;
    public gk10 b;
    public int c;
    public final /* synthetic */ gk10 d;
    public final /* synthetic */ Function2<TextClassifier, v1b<Object>, Object> e;

    @c0d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1", f = "PlatformSelectionBehaviors.android.kt", l = {266}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<Object>, Object> {
        public int a;
        public final /* synthetic */ TextClassifier b;
        public final /* synthetic */ Function2<TextClassifier, v1b<Object>, Object> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TextClassifier textClassifier, Function2<? super TextClassifier, ? super v1b<Object>, ? extends Object> function2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = textClassifier;
            this.c = function2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            TextClassifier textClassifier = this.b;
            if (textClassifier == null) {
                return null;
            }
            this.a = 1;
            Object objInvoke = this.c.invoke(textClassifier, this);
            return objInvoke == y5bVar ? y5bVar : objInvoke;
        }
    }

    @c0d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1", f = "PlatformSelectionBehaviors.android.kt", l = {}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super TextClassifier>, Object> {
        public final /* synthetic */ gk10 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gk10 gk10Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = gk10Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super TextClassifier> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            gk10 gk10Var = this.a;
            TextClassifier textClassifierA = wdf0.a(gk10Var.b, gk10Var.c);
            gk10Var.f = textClassifierA;
            return textClassifierA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public bk10(gk10 gk10Var, Function2<? super TextClassifier, ? super v1b<Object>, ? extends Object> function2, v1b<? super bk10> v1bVar) {
        super(2, v1bVar);
        this.d = gk10Var;
        this.e = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bk10(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<Object> v1bVar) {
        return ((bk10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0082 A[RETURN] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        gk10 gk10Var;
        quw quwVar;
        quw quwVar2;
        TextClassifier textClassifierA;
        Object objC;
        y5b y5bVar = y5b.a;
        int i = this.c;
        try {
            if (i == 0) {
                uj50.b(obj);
                gk10Var = this.d;
                quwVar = gk10Var.e;
                this.a = quwVar;
                this.b = gk10Var;
                this.c = 1;
                if (quwVar.d(this) != y5bVar) {
                }
                return y5bVar;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                quwVar2 = this.a;
                try {
                    uj50.b(obj);
                    textClassifierA = zj10.a(obj);
                    quwVar = quwVar2;
                    quwVar.f(null);
                    a aVar = new a(textClassifierA, this.e, null);
                    this.a = null;
                    this.b = null;
                    this.c = 3;
                    objC = vxf0.c(200L, aVar, this);
                    if (objC == y5bVar) {
                        return y5bVar;
                    }
                    return objC;
                } catch (Throwable th) {
                    th = th;
                    quwVar2.f(null);
                    throw th;
                }
            }
            gk10Var = this.b;
            quw quwVar3 = this.a;
            uj50.b(obj);
            quwVar = quwVar3;
            textClassifierA = gk10Var.f;
            if (textClassifierA == null || textClassifierA.isDestroyed()) {
                b bVar = new b(gk10Var, null);
                this.a = quwVar;
                this.b = null;
                this.c = 2;
                Object objC2 = vxf0.c(300L, bVar, this);
                if (objC2 != y5bVar) {
                    quwVar2 = quwVar;
                    obj = objC2;
                    textClassifierA = zj10.a(obj);
                    quwVar = quwVar2;
                    quwVar.f(null);
                    a aVar2 = new a(textClassifierA, this.e, null);
                    this.a = null;
                    this.b = null;
                    this.c = 3;
                    objC = vxf0.c(200L, aVar2, this);
                    if (objC == y5bVar) {
                        return objC;
                    }
                }
            } else {
                quwVar.f(null);
                a aVar3 = new a(textClassifierA, this.e, null);
                this.a = null;
                this.b = null;
                this.c = 3;
                objC = vxf0.c(200L, aVar3, this);
                if (objC == y5bVar) {
                    return objC;
                }
            }
            return y5bVar;
        } catch (Throwable th2) {
            th = th2;
            quwVar2 = quwVar;
            quwVar2.f(null);
            throw th;
        }
    }
}
