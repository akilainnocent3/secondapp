package defpackage;

import android.os.Build;
import android.view.View;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.sportybet.plugin.realsports.data.CashOut;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class fbv {
    public final a a;
    public final dbv b;
    public final View c;

    public static class a {
        public OnBackInvokedCallback a;

        public OnBackInvokedCallback a(final dbv dbvVar) {
            Objects.requireNonNull(dbvVar);
            return new OnBackInvokedCallback() { // from class: ebv
                public final void onBackInvoked() {
                    dbvVar.c();
                }
            };
        }

        public void b(dbv dbvVar, View view, boolean z) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.a == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) != null) {
                OnBackInvokedCallback onBackInvokedCallbackA = a(dbvVar);
                this.a = onBackInvokedCallbackA;
                onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? CashOut.BIG_NUMBER : 0, onBackInvokedCallbackA);
            }
        }

        public void c(View view) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (this.a == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.a);
            this.a = null;
        }
    }

    public static class b extends a {

        public class a implements OnBackAnimationCallback {
            public final /* synthetic */ dbv a;

            public a(dbv dbvVar) {
                this.a = dbvVar;
            }

            public final void onBackCancelled() {
                if (b.this.a != null) {
                    this.a.b();
                }
            }

            public final void onBackInvoked() {
                this.a.c();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                if (b.this.a != null) {
                    this.a.d(new sr1(backEvent));
                }
            }

            public final void onBackStarted(BackEvent backEvent) {
                if (b.this.a != null) {
                    this.a.a(new sr1(backEvent));
                }
            }
        }

        @Override // fbv.a
        public final OnBackInvokedCallback a(dbv dbvVar) {
            return new a(dbvVar);
        }
    }

    public fbv(dbv dbvVar, View view) {
        int i = Build.VERSION.SDK_INT;
        this.a = i >= 34 ? new b() : i >= 33 ? new a() : null;
        this.b = dbvVar;
        this.c = view;
    }

    public final void a(boolean z) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.b(this.b, this.c, z);
        }
    }

    public final void b() {
        a aVar = this.a;
        if (aVar != null) {
            aVar.c(this.c);
        }
    }
}
