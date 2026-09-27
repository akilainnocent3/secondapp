package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedReader f45939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Queue f45940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f45941c;

    public f(LinkedList linkedList, BufferedReader bufferedReader) {
        this.f45940b = linkedList;
        this.f45939a = bufferedReader;
    }

    public final boolean a() throws IOException {
        String strTrim;
        if (this.f45941c != null) {
            return true;
        }
        if (!this.f45940b.isEmpty()) {
            this.f45941c = (String) this.f45940b.poll();
            return true;
        }
        do {
            String line = this.f45939a.readLine();
            this.f45941c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.f45941c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }
}
