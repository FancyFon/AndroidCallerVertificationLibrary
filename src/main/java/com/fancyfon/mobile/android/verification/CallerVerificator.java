package com.fancyfon.mobile.android.verification;

/**
 * @author: Lena Jurkiewicz <lena.jurkiewicz@fancyfon.com>
 */
public interface CallerVerificator {

    boolean isCallerPermitted(int callingId);

    void isCallerPermitted(int callingId, CallerVerificatiorCallback callerVerificatiorCallback);
}
