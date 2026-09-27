package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class InneractiveUserConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44591a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Gender f44592b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44593c = null;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum Gender {
        MALE,
        FEMALE
    }

    public static boolean ageIsValid(int i10) {
        return i10 >= 1 && i10 <= 120;
    }

    public int getAge() {
        return this.f44591a;
    }

    public Gender getGender() {
        return this.f44592b;
    }

    @Deprecated
    public String getZipCode() {
        return this.f44593c;
    }

    public InneractiveUserConfig setAge(int i10) {
        if (ageIsValid(i10)) {
            this.f44591a = i10;
            return this;
        }
        IAlog.f("The Age is invalid. Please use a number between 1 and 120", new Object[0]);
        return this;
    }

    public InneractiveUserConfig setGender(Gender gender) {
        if (gender != null) {
            this.f44592b = gender;
            return this;
        }
        IAlog.f("The gender is invalid. Please use one of the suggested InneractiveAdView.Gender", new Object[0]);
        return this;
    }

    @Deprecated
    public InneractiveUserConfig setZipCode(String str) {
        if (str == null || !Pattern.compile("(^\\d{5}$)|(^\\d{5}-\\d{4}$)").matcher(str).matches()) {
            IAlog.c("The zipcode format is invalid. Please use a valid value.", new Object[0]);
            return this;
        }
        this.f44593c = str;
        return this;
    }
}
