package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class alk0 extends xjk0 {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xjk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws JSONException {
        BasePendingResult basePendingResult;
        BasePendingResult basePendingResult2;
        String strD;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            glk0 glk0Var = (glk0) this;
            glk0Var.b();
            zkk0.a(glk0Var.a).b();
            return true;
        }
        glk0 glk0Var2 = (glk0) this;
        glk0Var2.b();
        RevocationBoundService revocationBoundService = glk0Var2.a;
        k1e0 k1e0VarA = k1e0.a(revocationBoundService);
        GoogleSignInAccount googleSignInAccountB = k1e0VarA.b();
        GoogleSignInOptions googleSignInOptionsG0 = GoogleSignInOptions.z;
        if (googleSignInAccountB != null) {
            String strD2 = k1e0VarA.d("defaultGoogleSignInAccount");
            if (TextUtils.isEmpty(strD2) || (strD = k1e0VarA.d(k1e0.f("googleSignInOptions", strD2))) == null) {
                googleSignInOptionsG0 = null;
            } else {
                try {
                    googleSignInOptionsG0 = GoogleSignInOptions.G0(strD);
                } catch (JSONException unused) {
                    googleSignInOptionsG0 = null;
                }
            }
        }
        GoogleSignInOptions googleSignInOptions = googleSignInOptionsG0;
        hm20.h(googleSignInOptions);
        d6l d6lVar = new d6l(revocationBoundService, null, m41.a, googleSignInOptions, new u4l.a(new om0(), Looper.getMainLooper()));
        Context context = d6lVar.a;
        ogk0 ogk0Var = d6lVar.h;
        if (googleSignInAccountB != null) {
            boolean z = d6lVar.d() == 3;
            mgt mgtVar = xkk0.a;
            if (mgtVar.c <= 3) {
                Log.d(mgtVar.a, mgtVar.b.concat("Revoking access"));
            }
            String strD3 = k1e0.a(context).d("refreshToken");
            xkk0.a(context);
            if (!z) {
                ukk0 ukk0Var = new ukk0(ogk0Var);
                ogk0Var.b(ukk0Var);
                basePendingResult2 = ukk0Var;
            } else if (strD3 == null) {
                mgt mgtVar2 = wjk0.c;
                Status status = new Status(4, null, null, null);
                hm20.a("Status code must not be SUCCESS", !(status.a <= 0));
                gik0 gik0Var = new gik0(status);
                gik0Var.e(status);
                basePendingResult2 = gik0Var;
            } else {
                wjk0 wjk0Var = new wjk0(strD3);
                new Thread(wjk0Var).start();
                basePendingResult2 = wjk0Var.b;
            }
            jjk0 jjk0Var = new jjk0();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            basePendingResult2.a(new cjk0(basePendingResult2, taskCompletionSource, jjk0Var));
            taskCompletionSource.getTask();
        } else {
            boolean z2 = d6lVar.d() == 3;
            mgt mgtVar3 = xkk0.a;
            if (mgtVar3.c <= 3) {
                Log.d(mgtVar3.a, mgtVar3.b.concat("Signing out"));
            }
            xkk0.a(context);
            if (z2) {
                Status status2 = Status.e;
                hm20.i(status2, "Result must not be null");
                a0e0 a0e0Var = new a0e0(ogk0Var);
                a0e0Var.e(status2);
                basePendingResult = a0e0Var;
            } else {
                qkk0 qkk0Var = new qkk0(ogk0Var);
                ogk0Var.b(qkk0Var);
                basePendingResult = qkk0Var;
            }
            jjk0 jjk0Var2 = new jjk0();
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            basePendingResult.a(new cjk0(basePendingResult, taskCompletionSource2, jjk0Var2));
            taskCompletionSource2.getTask();
        }
        return true;
    }
}
