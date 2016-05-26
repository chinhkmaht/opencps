/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.paymentmgt.service.impl;

import java.util.List;

import org.opencps.dossiermgt.model.Dossier;
import org.opencps.paymentmgt.model.PaymentFile;
import org.opencps.paymentmgt.service.base.PaymentFileLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;

/**
 * The implementation of the Payment file local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.paymentmgt.service.PaymentFileLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author trungdk
 * @see org.opencps.paymentmgt.service.base.PaymentFileLocalServiceBaseImpl
 * @see org.opencps.paymentmgt.service.PaymentFileLocalServiceUtil
 */
public class PaymentFileLocalServiceImpl extends PaymentFileLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link org.opencps.paymentmgt.service.PaymentFileLocalServiceUtil} to access the Payment file local service.
	 */
	
	public int countCustomerPaymentFile(long groupId, String keyword, boolean isCitizen, long customerId, int paymentStatus) {
		return paymentFileFinder.countCustomerPaymentFile(groupId, keyword, isCitizen, customerId, paymentStatus);
	}
	
	public List<PaymentFile> searchCustomerPaymentFile(long groupId, String keyword, boolean isCitizen, long customerId, int paymentStatus, int start, int end, OrderByComparator obc) {
		return paymentFileFinder.searchCustomerPaymentFile(groupId, keyword, isCitizen, customerId, paymentStatus, start, end, obc);
	}
	
	public PaymentFile getPaymentFileByGoodCode(long groupId, String keypayGoodCode) throws SystemException {
		return paymentFilePersistence.fetchByGoodCode(groupId, keypayGoodCode);
	}
}