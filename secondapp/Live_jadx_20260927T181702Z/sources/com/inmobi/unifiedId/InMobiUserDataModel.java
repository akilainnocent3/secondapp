package com.inmobi.unifiedId;

import gi.j;
import java.util.HashMap;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class InMobiUserDataModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InMobiUserDataTypes f58321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InMobiUserDataTypes f58322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f58323c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nInMobiUserDataModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InMobiUserDataModel.kt\ncom/inmobi/unifiedId/InMobiUserDataModel$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InMobiUserDataTypes f58324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InMobiUserDataTypes f58325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public HashMap f58326c;

        @l
        public final InMobiUserDataModel build() {
            return new InMobiUserDataModel(this.f58324a, this.f58325b, this.f58326c);
        }

        @l
        public final Builder emailId(@m InMobiUserDataTypes inMobiUserDataTypes) {
            this.f58325b = inMobiUserDataTypes;
            return this;
        }

        @l
        public final Builder extras(@m HashMap<String, String> map) {
            this.f58326c = map;
            return this;
        }

        @l
        public final Builder phoneNumber(@m InMobiUserDataTypes inMobiUserDataTypes) {
            this.f58324a = inMobiUserDataTypes;
            return this;
        }
    }

    public InMobiUserDataModel(@m InMobiUserDataTypes inMobiUserDataTypes, @m InMobiUserDataTypes inMobiUserDataTypes2, @m HashMap<String, String> map) {
        this.f58321a = inMobiUserDataTypes;
        this.f58322b = inMobiUserDataTypes2;
        this.f58323c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InMobiUserDataModel copy$default(InMobiUserDataModel inMobiUserDataModel, InMobiUserDataTypes inMobiUserDataTypes, InMobiUserDataTypes inMobiUserDataTypes2, HashMap map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            inMobiUserDataTypes = inMobiUserDataModel.f58321a;
        }
        if ((i10 & 2) != 0) {
            inMobiUserDataTypes2 = inMobiUserDataModel.f58322b;
        }
        if ((i10 & 4) != 0) {
            map = inMobiUserDataModel.f58323c;
        }
        return inMobiUserDataModel.copy(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    @m
    public final InMobiUserDataTypes component1() {
        return this.f58321a;
    }

    @m
    public final InMobiUserDataTypes component2() {
        return this.f58322b;
    }

    @m
    public final HashMap<String, String> component3() {
        return this.f58323c;
    }

    @l
    public final InMobiUserDataModel copy(@m InMobiUserDataTypes inMobiUserDataTypes, @m InMobiUserDataTypes inMobiUserDataTypes2, @m HashMap<String, String> map) {
        return new InMobiUserDataModel(inMobiUserDataTypes, inMobiUserDataTypes2, map);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InMobiUserDataModel)) {
            return false;
        }
        InMobiUserDataModel inMobiUserDataModel = (InMobiUserDataModel) obj;
        return m0.g(this.f58321a, inMobiUserDataModel.f58321a) && m0.g(this.f58322b, inMobiUserDataModel.f58322b) && m0.g(this.f58323c, inMobiUserDataModel.f58323c);
    }

    @m
    public final InMobiUserDataTypes getEmailId() {
        return this.f58322b;
    }

    @m
    public final HashMap<String, String> getExtras() {
        return this.f58323c;
    }

    @m
    public final InMobiUserDataTypes getPhoneNumber() {
        return this.f58321a;
    }

    public int hashCode() {
        InMobiUserDataTypes inMobiUserDataTypes = this.f58321a;
        int iHashCode = (inMobiUserDataTypes == null ? 0 : inMobiUserDataTypes.hashCode()) * 31;
        InMobiUserDataTypes inMobiUserDataTypes2 = this.f58322b;
        int iHashCode2 = (iHashCode + (inMobiUserDataTypes2 == null ? 0 : inMobiUserDataTypes2.hashCode())) * 31;
        HashMap map = this.f58323c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @l
    public String toString() {
        return "InMobiUserDataModel(phoneNumber=" + this.f58321a + ", emailId=" + this.f58322b + ", extras=" + this.f58323c + j.f86771d;
    }
}
