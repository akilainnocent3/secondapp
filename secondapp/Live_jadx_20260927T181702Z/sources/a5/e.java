package a5;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Map;
import x4.b2;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public abstract class e implements r {

    @Nullable
    private z dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<x1> listeners = new ArrayList<>(1);

    public e(boolean z10) {
        this.isNetwork = z10;
    }

    @Override // a5.r
    @x4.m1
    public final void addTransferListener(x1 x1Var) {
        zi.l0.E(x1Var);
        if (this.listeners.contains(x1Var)) {
            return;
        }
        this.listeners.add(x1Var);
        this.listenerCount++;
    }

    public final void bytesTransferred(int i10) {
        z zVar = (z) b2.o(this.dataSpec);
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            this.listeners.get(i11).g(this, zVar, this.isNetwork, i10);
        }
    }

    @Override // a5.r
    public /* synthetic */ Map getResponseHeaders() {
        return q.a(this);
    }

    public final void transferEnded() {
        z zVar = (z) b2.o(this.dataSpec);
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).f(this, zVar, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferInitializing(z zVar) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).e(this, zVar, this.isNetwork);
        }
    }

    public final void transferStarted(z zVar) {
        this.dataSpec = zVar;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).h(this, zVar, this.isNetwork);
        }
    }
}
