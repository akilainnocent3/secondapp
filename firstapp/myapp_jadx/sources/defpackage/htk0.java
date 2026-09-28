package defpackage;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
public final class htk0 extends u4l {
    public static final sl0 k = new sl0("LocationServices.API", new usk0(), new sl0.g());

    public final Task d(LocationRequest locationRequest, pet.a aVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            hm20.i(looper, "invalid null looper");
        }
        yis yisVar = new yis(looper, aVar, jet.class.getSimpleName());
        btk0 btk0Var = new btk0(this, yisVar);
        ztk0 ztk0Var = new ztk0(btk0Var, locationRequest);
        ox40 ox40Var = new ox40();
        ox40Var.a = ztk0Var;
        ox40Var.b = btk0Var;
        ox40Var.c = yisVar;
        ox40Var.d = 2436;
        yis.a aVar2 = ox40Var.c.c;
        hm20.i(aVar2, "Key must not be null");
        yis yisVar2 = ox40Var.c;
        int i = ox40Var.d;
        ehk0 ehk0Var = new ehk0(ox40Var, yisVar2, i);
        fhk0 fhk0Var = new fhk0(ox40Var, aVar2);
        hm20.i(yisVar2.c, "Listener has already been released.");
        y4l y4lVar = this.j;
        y4lVar.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        y4lVar.f(taskCompletionSource, i, this);
        bhk0 bhk0Var = new bhk0(new dik0(new chk0(ehk0Var, fhk0Var), taskCompletionSource), y4lVar.w.get(), this);
        ljk0 ljk0Var = y4lVar.C;
        ljk0Var.sendMessage(ljk0Var.obtainMessage(8, bhk0Var));
        return taskCompletionSource.getTask();
    }
}
