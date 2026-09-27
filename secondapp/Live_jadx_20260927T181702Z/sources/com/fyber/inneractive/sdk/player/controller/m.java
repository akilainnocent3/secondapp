package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.enums.b f45515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f45516b;

    public m(q qVar, com.fyber.inneractive.sdk.player.enums.b bVar) {
        this.f45516b = qVar;
        this.f45515a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar;
        try {
            try {
                Iterator it = this.f45516b.f45519b.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(this.f45515a);
                }
                com.fyber.inneractive.sdk.player.enums.b bVar = this.f45515a;
                if (bVar == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar == com.fyber.inneractive.sdk.player.enums.b.Error) {
                    com.fyber.inneractive.sdk.util.v.a(this.f45516b.f45527j);
                    qVar = this.f45516b;
                    qVar.f45527j = null;
                    qVar.f45528k = null;
                }
            } catch (Exception e10) {
                if (IAlog.f47836a <= 3) {
                    q qVar2 = this.f45516b;
                    qVar2.getClass();
                    IAlog.a("%sonPlayerStateChanged callback threw an exception!", e10, IAlog.a(qVar2));
                }
                com.fyber.inneractive.sdk.player.enums.b bVar2 = this.f45515a;
                if (bVar2 != com.fyber.inneractive.sdk.player.enums.b.Idle && bVar2 != com.fyber.inneractive.sdk.player.enums.b.Error) {
                    return;
                }
                com.fyber.inneractive.sdk.util.v.a(this.f45516b.f45527j);
                qVar = this.f45516b;
                qVar.f45527j = null;
            }
        } catch (Throwable th2) {
            com.fyber.inneractive.sdk.player.enums.b bVar3 = this.f45515a;
            if (bVar3 == com.fyber.inneractive.sdk.player.enums.b.Idle || bVar3 == com.fyber.inneractive.sdk.player.enums.b.Error) {
                com.fyber.inneractive.sdk.util.v.a(this.f45516b.f45527j);
                q qVar3 = this.f45516b;
                qVar3.f45527j = null;
                qVar3.f45528k = null;
            }
            throw th2;
        }
    }
}
