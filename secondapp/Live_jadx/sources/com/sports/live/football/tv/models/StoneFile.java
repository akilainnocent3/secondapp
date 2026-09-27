package com.sports.live.football.tv.models;

import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StoneFile {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @m
    private String f73577id = "";

    @l
    private String auth_token = "";

    @l
    private String build_no = "";

    @l
    public final String getAuth_token() {
        return this.auth_token;
    }

    @l
    public final String getBuild_no() {
        return this.build_no;
    }

    @m
    public final String getId() {
        return this.f73577id;
    }

    public final void setAuth_token(@l String str) {
        m0.p(str, "<set-?>");
        this.auth_token = str;
    }

    public final void setBuild_no(@l String str) {
        m0.p(str, "<set-?>");
        this.build_no = str;
    }

    public final void setId(@m String str) {
        this.f73577id = str;
    }
}
