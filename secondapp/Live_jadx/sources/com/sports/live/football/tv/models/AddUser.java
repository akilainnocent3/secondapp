package com.sports.live.football.tv.models;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AddUser {

    @m
    private String passphrase = "";

    @l
    private String channel_url = "";

    @l
    public final String getChannel_url() {
        return this.channel_url;
    }

    @m
    public final String getPassphrase() {
        return this.passphrase;
    }

    public final void setChannel_url(@l String str) {
        m0.p(str, "<set-?>");
        this.channel_url = str;
    }

    public final void setPassphrase(@m String str) {
        this.passphrase = str;
    }
}
