package defpackage;

import android.content.Context;
import android.content.Intent;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.feature.debugscreen.impl.DebugScreenActivity;
import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.FormBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class q0d implements m0d {
    public final t4g a;
    public final yi5 b;
    public final j1b c;

    @c0d(c = "com.sportybet.feature.debugscreen.impl.DebugScreenFeatureImpl$saveEncryptedRequestAsync$1", f = "DebugScreenFeatureImpl.kt", l = {58}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Request c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Request request, String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = request;
            this.d = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return q0d.this.new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                t4g t4gVar = q0d.this.a;
                if (t4gVar != null) {
                    long timeInMillis = Calendar.getInstance().getTimeInMillis();
                    Request request = this.c;
                    String strEncodedPath = request.url().encodedPath();
                    String strMethod = request.method();
                    RequestBody requestBodyBody = request.body();
                    String str = "";
                    if (requestBodyBody != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            int size = ((FormBody) requestBodyBody).size();
                            for (int i2 = 0; i2 < size; i2++) {
                                jSONObject.put(((FormBody) requestBodyBody).name(i2), ((FormBody) requestBodyBody).value(i2));
                            }
                            String string = jSONObject.toString(4);
                            string.getClass();
                            str = string;
                        } catch (Exception unused) {
                        }
                    }
                    EncryptedRequest encryptedRequest = new EncryptedRequest(0L, timeInMillis, strEncodedPath, strMethod, str, this.d, 1, (DefaultConstructorMarker) null);
                    this.a = 1;
                    obj = t4gVar.a(encryptedRequest, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return Unit.a;
        }
    }

    public q0d(t4g t4gVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar, yi5 yi5Var) {
        yi5Var.getClass();
        this.a = t4gVar;
        this.b = yi5Var;
        this.c = w5b.a(oddVar.plus(new r0d(l5b.a.a)));
    }

    @Override // defpackage.m0d
    public final Intent a(Context context) {
        return new Intent(context, (Class<?>) DebugScreenActivity.class);
    }

    @Override // defpackage.m0d
    public final void b(Request request, String str) {
        request.getClass();
        str.getClass();
        if (this.b.b().i()) {
            ej5.c(this.c, null, null, new a(request, str, null), 3);
        }
    }
}
