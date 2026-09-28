package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class wxk implements lyh<vxk.a> {
    public final /* synthetic */ lyh[] a;

    @c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.giftvalueeditor.GiftValueEditorStateHandlerImpl$init$$inlined$combine$1", f = "GiftValueEditorStateHandlerImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return wxk.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[8];
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.gift.handler.giftvalueeditor.GiftValueEditorStateHandlerImpl$init$$inlined$combine$1$3", f = "GiftValueEditorStateHandlerImpl.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super vxk.a>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;

        @Override // defpackage.gaj
        public final Object invoke(myh<? super vxk.a> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                GiftDetails giftDetails = (GiftDetails) objArr[0];
                Object obj2 = objArr[1];
                obj2.getClass();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Object obj3 = objArr[2];
                obj3.getClass();
                Object obj4 = objArr[3];
                obj4.getClass();
                Object obj5 = objArr[4];
                obj5.getClass();
                Object obj6 = objArr[5];
                obj6.getClass();
                boolean zBooleanValue2 = ((Boolean) obj6).booleanValue();
                Object obj7 = objArr[6];
                obj7.getClass();
                Object obj8 = objArr[7];
                obj8.getClass();
                vxk.a aVar = new vxk.a(giftDetails, zBooleanValue, (cyk) obj3, (String) obj4, (String) obj5, zBooleanValue2, (List) obj7, ((Boolean) obj8).booleanValue());
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(aVar, this) == y5bVar) {
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

    public wxk(lyh[] lyhVarArr) {
        this.a = lyhVarArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super vxk.a> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(3, null);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
