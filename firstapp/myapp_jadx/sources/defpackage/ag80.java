package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ag80 {
    public final c a;

    public static final class a implements c {
        public final SessionConfiguration a;
        public final List<oaz> b;

        public a(int i, ArrayList arrayList, Executor executor, gpe0 gpe0Var) {
            oaz oazVar;
            SessionConfiguration sessionConfiguration = new SessionConfiguration(i, ag80.a(arrayList), executor, gpe0Var);
            this.a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
            for (OutputConfiguration outputConfiguration : outputConfigurations) {
                if (outputConfiguration == null) {
                    oazVar = null;
                } else {
                    int i2 = Build.VERSION.SDK_INT;
                    oazVar = new oaz(i2 >= 33 ? new saz(outputConfiguration) : i2 >= 28 ? new raz(new raz.a(outputConfiguration)) : i2 >= 26 ? new qaz(new qaz.a(outputConfiguration)) : new paz(new paz.a(outputConfiguration)));
                }
                arrayList2.add(oazVar);
            }
            this.b = Collections.unmodifiableList(arrayList2);
        }

        @Override // ag80.c
        public final sln a() {
            return sln.a(this.a.getInputConfiguration());
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // ag80.c
        public final int i() {
            return this.a.getSessionType();
        }

        @Override // ag80.c
        public final CameraCaptureSession.StateCallback j() {
            return this.a.getStateCallback();
        }

        @Override // ag80.c
        public final List<oaz> k() {
            return this.b;
        }

        @Override // ag80.c
        public final void l(sln slnVar) {
            this.a.setInputConfiguration(slnVar.a.a);
        }

        @Override // ag80.c
        public final Object m() {
            return this.a;
        }

        @Override // ag80.c
        public final Executor n() {
            return this.a.getExecutor();
        }

        @Override // ag80.c
        public final void o(CaptureRequest captureRequest) {
            this.a.setSessionParameters(captureRequest);
        }
    }

    public interface c {
        sln a();

        int i();

        CameraCaptureSession.StateCallback j();

        List<oaz> k();

        void l(sln slnVar);

        Object m();

        Executor n();

        void o(CaptureRequest captureRequest);
    }

    public ag80(int i, ArrayList arrayList, Executor executor, gpe0 gpe0Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.a = new b(i, arrayList, executor, gpe0Var);
        } else {
            this.a = new a(i, arrayList, executor, gpe0Var);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((oaz) it.next()).a.h());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ag80)) {
            return false;
        }
        return this.a.equals(((ag80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public static final class b implements c {
        public final List<oaz> a;
        public final gpe0 b;
        public final Executor c;
        public final int d;
        public sln e = null;

        public b(int i, ArrayList arrayList, Executor executor, gpe0 gpe0Var) {
            this.d = i;
            this.a = Collections.unmodifiableList(new ArrayList(arrayList));
            this.b = gpe0Var;
            this.c = executor;
        }

        @Override // ag80.c
        public final sln a() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                List<oaz> list = bVar.a;
                if (Objects.equals(this.e, bVar.e) && this.d == bVar.d) {
                    List<oaz> list2 = this.a;
                    if (list2.size() == list.size()) {
                        for (int i = 0; i < list2.size(); i++) {
                            if (!list2.get(i).equals(list.get(i))) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() ^ 31;
            int i = (iHashCode << 5) - iHashCode;
            sln slnVar = this.e;
            int iHashCode2 = (slnVar == null ? 0 : slnVar.a.a.hashCode()) ^ i;
            return this.d ^ ((iHashCode2 << 5) - iHashCode2);
        }

        @Override // ag80.c
        public final int i() {
            return this.d;
        }

        @Override // ag80.c
        public final CameraCaptureSession.StateCallback j() {
            return this.b;
        }

        @Override // ag80.c
        public final List<oaz> k() {
            return this.a;
        }

        @Override // ag80.c
        public final void l(sln slnVar) {
            if (this.d != 1) {
                this.e = slnVar;
            } else {
                zkh.a("Method not supported for high speed session types");
            }
        }

        @Override // ag80.c
        public final Object m() {
            return null;
        }

        @Override // ag80.c
        public final Executor n() {
            return this.c;
        }

        @Override // ag80.c
        public final void o(CaptureRequest captureRequest) {
        }
    }
}
